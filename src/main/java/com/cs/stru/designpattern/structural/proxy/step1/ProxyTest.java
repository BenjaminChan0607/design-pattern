package com.cs.stru.designpattern.structural.proxy.step1;

import com.cs.stru.designpattern.structural.proxy.step1.cglib.CGLibProxy;
import com.cs.stru.designpattern.structural.proxy.step1.jdk.JdkDynamicProxy;
import com.cs.stru.designpattern.structural.proxy.step1.simple.Hello;
import com.cs.stru.designpattern.structural.proxy.step1.simple.HelloImpl;
import com.cs.stru.designpattern.structural.proxy.step1.simple.HelloProxy;

/**
 * Created by benjaminChan on 2018/7/12 0012 下午 7:16.
 */
public class ProxyTest {

    /**
     * 代理模式：分为静态代理和动态代理
     * 静态代理一般采用组合的方式
     * <p>
     * 动态代理有jdk的动态代理和cglib的动态代理
     * <p>
     * jdk的动态代理代理有相关接口的类
     * CGLib的动态代理代理没有相关接口的类
     *
     * @param args
     */
    public static void main(String[] args) {
        ProxyTest proxyTest = new ProxyTest();
//        proxyTest.test1();
//        proxyTest.test2();
        proxyTest.test3();
    }

    private void test3() {
        Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        helloProxy.hello("tom");
    }

    private void test2() {
        JdkDynamicProxy jdkDynamicProxy = new JdkDynamicProxy(new HelloImpl());
        Hello hello = jdkDynamicProxy.getProxy();
        hello.hello("tom");
    }

    private void test1() {
        Hello hello = new HelloImpl();
        hello.hello("tom");
        SplitUtil.print();

        HelloProxy song = new HelloProxy(new HelloImpl());
        song.hello("tom");
        SplitUtil.print();
    }
}
