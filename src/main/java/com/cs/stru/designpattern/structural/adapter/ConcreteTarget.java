package com.cs.stru.designpattern.structural.adapter;

/**
 * Created by benjaminChan on 2018/7/11 0011 下午 8:13.
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("具体类 实现 具体功能");
    }
}
