package com.cs.stru.designpattern.behavior.strategy.complex;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

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
        Class<PriceStrategy> priceStrategyClass = null;
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

    private static final String BASE_PACKAGE = "com.cs.stru.designpattern.behavior.strategy.complex";
    private ClassLoader classLoader = getClass().getClassLoader();
    private List<Class<? extends PriceStrategy>> priceStrategyList;

    public PriceStrategy getPriceStrategy(Client client) {
        for (Class<? extends PriceStrategy> clazz : priceStrategyList) {
            TotalPriceRange totalPriceRange = getAnnotation(clazz);
            if (client.getTotalAmount() >= totalPriceRange.min() && client.getTotalAmount() < totalPriceRange.max()) {
                try {
                    return clazz.newInstance();
                } catch (Exception e) {
                    throw new RuntimeException("getPriceStrategy error.");
                }
            }
        }
        throw new RuntimeException("getPriceStrategy error.");
    }

    private TotalPriceRange getAnnotation(Class<? extends PriceStrategy> clazz) {
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        if (annotations == null || annotations.length == 0) {
            return null;
        }
        for (Annotation annotation : annotations) {
            if (annotation instanceof TotalPriceRange) {
                return (TotalPriceRange) annotation;
            }
        }
        return null;
    }
}
