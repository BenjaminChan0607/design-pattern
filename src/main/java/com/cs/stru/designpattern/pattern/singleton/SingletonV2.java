package com.cs.stru.designpattern.pattern.singleton;

/**
 * @Date 2019/8/7 10:41
 * @Created by chending
 */
public class SingletonV2 {

    private static SingletonV2 singletonV2;

    private SingletonV2() {
    }

    public static SingletonV2 getInstance() {
        if (singletonV2 == null) {
            synchronized (SingletonV2.class) {
                if (singletonV2 == null) {
                    singletonV2 = new SingletonV2();
                }
            }
        }

        return singletonV2;
    }
}
