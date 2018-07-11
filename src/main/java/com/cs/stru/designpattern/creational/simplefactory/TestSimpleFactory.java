package com.cs.stru.designpattern.creational.simplefactory;

public class TestSimpleFactory {

    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct(new ProductA());
        productA.method();

        Product productB = SimpleFactory.createProduct(new ProductB());
        productB.method();
    }
}
