package com.cs.stru.designpattern.behavior.strategy.ultimate;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class PriceStrategyFactory {

    private static PriceStrategyFactory priceStrategyFactory = new PriceStrategyFactory();

    private PriceStrategyFactory() {
        init();
    }

    public static PriceStrategyFactory getInstance() {
        return priceStrategyFactory;
    }

    private void init() {
        priceStrategyList = new ArrayList<Class<? extends PriceStrategy>>();
        File[] resources = getResources();
        Class<PriceStrategy> priceStrategyClass;
        try {
            priceStrategyClass = (Class<PriceStrategy>) classLoader.loadClass(PriceStrategy.class.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("未找到策略资源");
        }

        for (File file : resources) {
            try {
                Class<?> clazz = classLoader.loadClass(BASE_PACKAGE + "." + file.getName().replace(".class", ""));
                if (PriceStrategy.class.isAssignableFrom(clazz) && clazz != priceStrategyClass) {
                    priceStrategyList.add((Class<? extends PriceStrategy>) clazz);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private File[] getResources() {
        try {
            File file = new File(classLoader.getResource(BASE_PACKAGE.replace(".", "/")).toURI());
            return file.listFiles(new FileFilter() {
                public boolean accept(File pathname) {
                    if (pathname.getName().endsWith(".class")) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (URISyntaxException e) {
            throw new RuntimeException("未找到策略资源");
        }
    }

    private static final String BASE_PACKAGE = "com.cs.stru.designpattern.behavior.strategy.ultimate";
    private ClassLoader classLoader = getClass().getClassLoader();
    private List<Class<? extends PriceStrategy>> priceStrategyList;

    public PriceStrategy getPriceStrategy(Client client) {
        SortedMap<Integer, Class<? extends PriceStrategy>> classSortedMap = new TreeMap<Integer, Class<? extends PriceStrategy>>();
        for (Class<? extends PriceStrategy> clazz : priceStrategyList) {
            Annotation priceRange = getAnnotation(clazz);
//变化点：根据注解类型进行不同的判断
            if (priceRange instanceof TotalPriceRange) {
                TotalPriceRange totalValidRegion = (TotalPriceRange) priceRange;
                //判断总金额是否在注解的区间
                if (client.getTotalAmount() >= totalValidRegion.value().min() && client.getTotalAmount() < totalValidRegion.value().max()) {
                    classSortedMap.put(totalValidRegion.value().order(), clazz);//将采用的策略放入MAP
                }
            } else if (priceRange instanceof OncePriceRange) {
                OncePriceRange onceValidRegion = (OncePriceRange) priceRange;
                //判断单次金额是否在注解的区间，注意这次判断的是客户当次消费的金额
                if (client.getAmount() >= onceValidRegion.value().min() && client.getAmount() < onceValidRegion.value().max()) {
                    classSortedMap.put(onceValidRegion.value().order(), clazz);//将采用的策略放入MAP
                }
            }
        }
        try {
            //我们采用动态代理处理策略重叠的问题，相信看过LZ的代理模式的同学应该都对代理模式的原理很熟悉了，那么下面出现的代理类LZ将不再解释，留给各位自己琢磨。
            return PriceProxy.getProxy(classSortedMap);
        } catch (Exception e) {
            throw new RuntimeException("策略获得失败");
        }
    }

    private Annotation getAnnotation(Class<? extends PriceStrategy> clazz) {
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        if (annotations == null || annotations.length == 0) {
            return null;
        }
        for (Annotation annotation : annotations) {
            if (annotation instanceof TotalPriceRange || annotation instanceof OncePriceRange) {
                return annotation;
            }
        }
        return null;
    }
}
