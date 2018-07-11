package com.cs.stru.designpattern.creational.singleinstance;

/**
 * 一个类没有自己的状态，无论实例化多少个都是一样的；
 * 这个类如果有两个及以上程序可能会产生错误；
 */

//注意：非静态的同步函数对象是this，静态的同步函数对象是：字节码对象。即类.class；
public class Singleton {

    /**
     * 饿汉式/懒汉式/双锁懒汉式
     */

    private static Singleton singleton;
//    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
