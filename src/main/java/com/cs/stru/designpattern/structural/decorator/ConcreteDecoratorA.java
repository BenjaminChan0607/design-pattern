package com.cs.stru.designpattern.structural.decorator;

/**
 * Created by benjaminChan on 2018/7/10 0010 下午 8:01.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void methodA() {
        System.out.println(this.getClass().getSimpleName() + "," + "扩展的方法");
    }

    public void method() {
        System.out.println("ConcreteDecoratorA 包装前");
        super.method();
        System.out.println("ConcreteDecoratorA 包装前后");
    }
}
