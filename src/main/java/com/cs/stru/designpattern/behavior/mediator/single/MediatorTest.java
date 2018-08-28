package com.cs.stru.designpattern.behavior.mediator.single;

public class MediatorTest {

    /**
     * 中介者模式：用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的
     * 交互。中介者模式又称为调停者模式，它是一种对象行为型模式
     *
     * @param args
     */
    public static void main(String[] args) {
        Pattern mediator = new MediatorPattern();
        Pattern singleton = new SingletonPattern();
        Pattern command = new CommandPattern();

        singleton.attack(mediator);
        command.attack(mediator);

        mediator.defend();
    }
}
