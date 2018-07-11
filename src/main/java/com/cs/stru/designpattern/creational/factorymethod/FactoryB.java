package com.cs.stru.designpattern.creational.factorymethod;

public class FactoryB implements Factory {
    public Light getProduce() {
        return new LightB();
    }
}
