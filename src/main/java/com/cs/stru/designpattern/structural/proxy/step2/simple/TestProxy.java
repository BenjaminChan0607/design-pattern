package com.cs.stru.designpattern.structural.proxy.step2.simple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author benjaminChan
 * @date 2018/8/10 0010 下午 4:21
 */
public class TestProxy implements InvocationHandler {

    private Object object;

    public TestProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        Object result = method.invoke(object, args);
//        return result;
        System.out.println("method");
        return null;
    }

    public static Object getProxy(Object object) {
        return Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{TestInterface.class}, new TestProxy(object));
    }

    public static void main(String[] args) {
        TestInterface testInterface = (TestInterface) TestProxy.getProxy(new TestClass());
        testInterface.method1();
        testInterface.method2();
        testInterface.method3();

        System.out.println(TestProxy.class.getClassLoader() == TestInterface.class.getClassLoader());
        System.out.println(TestProxy.class.getClassLoader() == ClassLoader.getSystemClassLoader());

    }
}
