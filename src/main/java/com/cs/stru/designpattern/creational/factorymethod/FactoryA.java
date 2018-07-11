package com.cs.stru.designpattern.creational.factorymethod;

public class FactoryA implements Factory {

    public Light getProduce() {
        return new LightA();
    }
}
