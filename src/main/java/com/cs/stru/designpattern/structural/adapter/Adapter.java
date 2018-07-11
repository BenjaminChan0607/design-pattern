package com.cs.stru.designpattern.structural.adapter;

/**
 * Created by benjaminChan on 2018/7/11 0011 下午 8:14.
 */
public class Adapter extends Adaptee implements Target {
    public void request() {
        super.specificRequest();
    }
}
