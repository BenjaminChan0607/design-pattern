package com.cs.stru.designpattern.structural.proxy.jdk;

import com.cs.stru.designpattern.structural.proxy.simple.Hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy implements InvocationHandler {

    private Object target;

    public JdkDynamicProxy(Hello target) {
        this.target = target;
    }

    //利用反射获取方法名称
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    private void after() {
        System.out.println("say after");
    }

    private void before() {
        System.out.println("say before");
    }
}
