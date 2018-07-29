package com.cs.stru.designpattern.behavior.strategy.simple;

public class ConcreteStrategyB implements Strategy {
    public void method() {
        System.out.println(getClass().getSimpleName());
    }
}
