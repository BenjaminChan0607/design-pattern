package com.cs.stru.designpattern.behavior.state.simple;

public class StateTest {

    /**
     * 定义：(源于Design Pattern)：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
     *
     *
     * 采用状态模式，运用多态消除if else
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Hero hero = new Hero();
        hero.startRun();
        hero.setState(Hero.SPEED_UP);
        Thread.sleep(1);
        hero.setState(Hero.SPEED_DOWN);
        Thread.sleep(1);
        hero.setState(Hero.DIZZINESS);
        Thread.sleep(1);
        hero.stopRun();

    }
}
