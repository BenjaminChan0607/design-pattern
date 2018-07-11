package com.cs.stru.designpattern.structural.decorator;

/**
 * Created by benjaminChan on 2018/7/10 0010 下午 7:52.
 */
public class TestDecorator {

    /**
     * 定义：装饰模式是在不必改变原类文件和使用继承的情况下，动态的扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
     *
     * 装饰来包裹真实的对象，经典应用IO流
     *
     * 采用动态扩展，采用组合的方式取代继承
     * @param args
     */
    public static void main(String[] args) {
        Component component = new ConcreteDecorator();
        component.method();

        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
        concreteDecoratorA.method();
        concreteDecoratorA.methodA();

        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);
        concreteDecoratorB.method();
        concreteDecoratorB.methodB();

        concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);
        concreteDecoratorB.method();
        concreteDecoratorB.methodB();
    }
}
