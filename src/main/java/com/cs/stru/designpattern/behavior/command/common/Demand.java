package com.cs.stru.designpattern.behavior.command.common;

public class Demand implements Task {

    private Programmer programmer;

    public Demand(Programmer programmer) {
        this.programmer = programmer;
    }

    public void hanlde() {
        programmer.handleDemand();
    }

    @Override
    public String toString() {
        return "Demand{" +
                "programmer=" + programmer +
                '}';
    }
}
