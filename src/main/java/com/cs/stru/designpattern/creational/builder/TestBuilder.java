package com.cs.stru.designpattern.creational.builder;

public class TestBuilder {

    /**     建造者模式
     * @param args
     */
    public static void main(String[] args) {
        Soul soul = new Soul();
        soul.createPerson("门卫");
        soul.head("大");
        soul.body("微胖");
        soul.leftArm("微胖");
        soul.rightArm("微胖");
        soul.leftHand("微胖");
        soul.rightHand("微胖");

        Soul soul1 = new Soul();
        soul1.createPerson("门卫1");
        soul1.head("小");
        soul1.body("微瘦");
        soul1.leftArm("微瘦");
        soul1.rightArm("微瘦");
        soul1.leftHand("微瘦");
        soul1.rightHand("微瘦");

        System.out.println(soul.toString());
        System.out.println(soul1.toString());

    }

}
