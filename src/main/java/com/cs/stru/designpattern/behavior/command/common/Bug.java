package com.cs.stru.designpattern.behavior.command.common;

public class Bug implements Task{

    private Programmer programmer;

    public Bug(Programmer programmer) {
        this.programmer = programmer;
    }

    public void hanlde() {
        programmer.handleBug();
    }

    @Override
    public String toString() {
        return "Bug{" +
                "programmer=" + programmer +
                '}';
    }
}
