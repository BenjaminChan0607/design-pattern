package com.cs.stru.designpattern.behavior.command.common;

public class Problem implements Task{

    private Programmer programmer;

    public Problem(Programmer programmer) {
        this.programmer = programmer;
    }

    public void hanlde() {
        programmer.handleProblem();
    }

    @Override
    public String toString() {
        return "Problem{" +
                "programmer=" + programmer +
                '}';
    }
}
