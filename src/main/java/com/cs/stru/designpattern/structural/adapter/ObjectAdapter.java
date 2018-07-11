package com.cs.stru.designpattern.structural.adapter;

/**
 * Created by benjaminChan on 2018/7/11 0011 下午 8:20.
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        this.adaptee.specificRequest();
    }
}
