package com.cs.stru.designpattern.behavior.mediator.single;

public abstract class Pattern {

    public abstract String getName();

    public void attack(Pattern pattern) {
        System.out.println(getName() + " attack " + pattern.getName());
    }

    public void defend() {
        System.out.println(getName() + " defend");
    }
}
