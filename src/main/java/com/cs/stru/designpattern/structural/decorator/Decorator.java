package com.cs.stru.designpattern.structural.decorator;

/**
 * Created by benjaminChan on 2018/7/10 0010 下午 7:59.
 */
public abstract class Decorator implements Component{

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void method() {
        component.method();
    }
}