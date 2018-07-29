package com.cs.stru.designpattern.behavior.strategy.ultimate;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.SortedMap;

public class PriceProxy implements InvocationHandler {

    private SortedMap<Integer, Class<? extends PriceStrategy>> sortedMap;

    private PriceProxy(SortedMap<Integer, Class<? extends PriceStrategy>> sortedMap) {
        this.sortedMap = sortedMap;
    }

    public static PriceStrategy getProxy(SortedMap<Integer, Class<? extends PriceStrategy>> sortedMap) {
        return (PriceStrategy) Proxy.newProxyInstance(PriceProxy.class.getClassLoader(), new Class<?>[]{PriceStrategy.class}, new PriceProxy(sortedMap));
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Double result = 0D;
        if ("calcPrice".equals(method.getName())) {
            for (Class<? extends PriceStrategy> clazz : sortedMap.values()) {
                if (result == 0) {
                    result = (Double) method.invoke(clazz.newInstance(), args);
                } else {
                    result = (Double) method.invoke(clazz.newInstance(), result);
                }
            }
            return result;
        }
        return null;
    }
}
