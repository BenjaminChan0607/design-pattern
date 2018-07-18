package com.cs.stru.designpattern.behavior.command.simple;

public class BusinessMan {

    private String name;

    public BusinessMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void provideDemand(Programmer programmer) {
        System.out.println(getName() + " provide demand");
        programmer.handleDemand();
    }

    public void provideBug(Programmer programmer) {
        System.out.println(getName() + " provide bug");
        programmer.handleBug();
    }

    public void provideProblem(Programmer programmer) {
        System.out.println(getName() + " provide problem");
        programmer.handleProblem();
    }
}
