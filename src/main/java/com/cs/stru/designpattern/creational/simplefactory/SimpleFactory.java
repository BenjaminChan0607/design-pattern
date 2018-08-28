package com.cs.stru.designpattern.creational.simplefactory;

public class SimpleFactory {

    private SimpleFactory() {
    }

    public static Product createProduct(Product product) {
        if (product instanceof ProductA) {
            return new ProductA();
        } else if (product instanceof ProductB) {
            return new ProductB();
        } else {
            //TODO list if else 过多
            throw new RuntimeException("illegal product exception");
        }
    }
}
