package com.cs.stru.designpattern.behavior.command.common;

public class Programmer {

    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void handleDemand() {
        System.out.println(getName() + " handleDemand");
    }

    public void handleBug() {
        System.out.println(getName() + " handleBug");
    }

    public void handleProblem() {
        System.out.println(getName() + " handleProblem");
    }

}
