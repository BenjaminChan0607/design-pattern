package com.cs.stru.designpattern.creational.abstractfactory;

public class TestAbstractFactory {

    /**
     * 简单工厂，还是工厂方法，只有一个抽象产品，所以工厂方法模式中再添加一个创造抽象产品的方法就是抽象工厂模式了，
     * 相应的添加一个抽象产品，还有一系列具体的该抽象产品的实现；
     *
     * 可以用两个工厂方法替换抽象工厂模式
     * @param args
     */
    public static void main(String[] args) {
        //通常有两种方式可以扩展一个接口或者类，就是继承和组合

        Factory factory = new ConcreteFactory1();
        ProductA productA = factory.createProductA();
        productA.methodA();
        ProductB productB = factory.createProductB();
        productB.methodB();

        factory = new ConcreteFactory2();
        productA = factory.createProductA();
        productA.methodA();
        productB = factory.createProductB();
        productB.methodB();

    }
}
