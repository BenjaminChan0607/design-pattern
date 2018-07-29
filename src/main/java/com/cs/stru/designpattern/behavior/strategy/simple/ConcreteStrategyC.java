package com.cs.stru.designpattern.behavior.strategy.simple;

public class ConcreteStrategyC implements Strategy {
    public void method() {
        System.out.println(getClass().getSimpleName());
    }
}
