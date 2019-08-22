package com.cs.stru.designpattern.pattern.singleton;

/**
 * @Date 2019/8/7 10:39
 * @Created by chending
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getSingleton() {
        return singleton;
    }
}
