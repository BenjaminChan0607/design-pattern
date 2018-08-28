package com.cs.stru.designpattern.behavior.strategy.simple;

public class StrategeTest {

    /**
     * 定义：策略模式定义了一系列的算法，并将它们封装起来，使得它们可以相互替换；
     * 策略模式让算法独立于它的客户而独立变化；
     *
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context();
        ConcreteStrategyA concreteStrategyA = new ConcreteStrategyA();
        ConcreteStrategyB concreteStrategyB = new ConcreteStrategyB();
        ConcreteStrategyC concreteStrategyC = new ConcreteStrategyC();

        context.setStrategy(concreteStrategyA);
        context.method();
        context.setStrategy(concreteStrategyB);
        context.method();
        context.setStrategy(concreteStrategyC);
        context.method();
    }
}
