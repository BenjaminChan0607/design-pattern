package com.cs.stru.designpattern.creational.factorymethod;

public class LightA implements Light {
    public void turnOn() {
        System.out.println("LightA turn on.");
    }

    public void turnOff() {
        System.out.println("LightA turn off.");
    }
}
