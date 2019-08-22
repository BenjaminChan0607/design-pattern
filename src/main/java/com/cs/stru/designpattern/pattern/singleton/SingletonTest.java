package com.cs.stru.designpattern.pattern.singleton;

/**
 * @Date 2019/8/7 10:39
 * @Created by chending
 *
 * 单例模式：保证该对象在内存中仅保有一份
 * 类的字节码文件在内存中仅保留一份
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
    }
}
