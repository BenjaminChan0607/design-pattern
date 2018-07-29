package com.cs.stru.designpattern.behavior.strategy.simple;

public class ConcreteStrategyA implements Strategy {
    public void method() {
        System.out.println(getClass().getSimpleName());
    }
}
