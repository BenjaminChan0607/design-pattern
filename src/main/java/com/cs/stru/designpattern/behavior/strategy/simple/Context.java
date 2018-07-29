package com.cs.stru.designpattern.behavior.strategy.simple;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void method() {
        strategy.method();
    }

}
