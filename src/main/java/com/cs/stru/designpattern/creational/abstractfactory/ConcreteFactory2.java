package com.cs.stru.designpattern.creational.abstractfactory;

public class ConcreteFactory2 implements Factory {

    public ProductA createProductA() {
        return new ProductA2();
    }

    public ProductB createProductB() {
        return new ProductB2();
    }
}
