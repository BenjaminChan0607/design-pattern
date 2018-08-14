package com.cs.stru.designpattern.structural.proxy.step1.simple;

public class HelloProxy {

    private Hello hello;

    public HelloProxy(Hello hello) {
        this.hello = hello;
    }

    public void hello(String name) {
        before();
        hello.hello(name);
        after();
    }

    private void after() {
        System.out.println("say after");
    }

    private void before() {
        System.out.println("say before");
    }
}
