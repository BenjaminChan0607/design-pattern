package com.cs.stru.designpattern.structural.proxy.step1.simple;

public class HelloImpl implements Hello {
    public void hello(String name) {
        System.out.println("say hello to " + name);
    }
}
