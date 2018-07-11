package com.cs.stru.designpattern.creational.builder;

public class Soul {

    private Person person;

    public void createPerson(String name) {
        this.person = new Person(name);
    }

    public Person getPerson() {
        try {
            return person;
        } finally {
            person = null;
        }
    }

    public void body(String body) {
        System.out.println("add" + person.getName() + "'s" + body);
        person.setBody(body);
    }

    public void head(String head) {
        System.out.println("add" + person.getName() + "'s" + head);
        person.setHead(head);
    }

    public void leftArm(String leftArm) {
        System.out.println("add" + person.getName() + "'s" + leftArm);
        person.setLeftArm(leftArm);
    }

    public void rightArm(String rightArm) {
        System.out.println("add" + person.getName() + "'s" + rightArm);
        person.setRightArm(rightArm);
    }

    public void leftHand(String leftHand) {
        System.out.println("add" + person.getName() + "'s" + leftHand);
        person.setLeftHand(leftHand);
    }

    public void rightHand(String rightHand) {
        System.out.println("add" + person.getName() + "'s" + rightHand);
        person.setBody(rightHand);
    }
}
