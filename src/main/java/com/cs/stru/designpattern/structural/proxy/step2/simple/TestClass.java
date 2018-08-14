package com.cs.stru.designpattern.structural.proxy.step2.simple;

/**
 * @author benjaminChan
 * @date 2018/8/10 0010 下午 4:20
 */
public class TestClass implements TestInterface {
    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }
}
