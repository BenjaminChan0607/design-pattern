package com.cs.stru.designpattern.creational.abstractfactory;

public class ConcreteFactory1 implements Factory {

    public ProductA createProductA() {
        return new ProductA1();
    }

    public ProductB createProductB() {
        return new ProductB1();
    }
}
