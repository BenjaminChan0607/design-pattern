package com.cs.stru.designpattern.creational.builder;

import lombok.Data;

@Data
public class Person {

    private String name;
    private String body;
    private String head;

    private String leftArm;
    private String rightArm;
    private String leftHand;
    private String rightHand;

    private String leftFoot;
    private String rightFoot;
    private String leftLeg;
    private String rightLeg;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return name;
    }
}
