package com.cs.stru.designpattern.behavior.memento.common;


/**
 * Created by benjaminChan on 2018/7/30 0030 下午 4:21.
 */
public class MementoTest {

    public static void main(String[] args) {
        Person tom = new Person("tom");
        Person jerry = new Person("jerry");

        tom.addStory("tom born in Hubei");
        tom.addStory("tom come from Qichun");

        jerry.addStory("jerry born in Jiangxi");
        jerry.addStory("jerry come from Nanchang");

        System.out.println(tom);
        System.out.println(jerry);

        BasicSoul basicSoul = new BasicSoul();
        basicSoul.recordMemory(tom);
        basicSoul.recordMemory(jerry);

        tom.addStory("lived in Nanchang for four years.");
        jerry.addStory("lived in Nanchang for four years.");
        System.out.println(tom);
        System.out.println(jerry);

        basicSoul.rollbackMemory(tom);
        basicSoul.rollbackMemory(jerry);
        System.out.println(tom);
        System.out.println(jerry);

        /*Soul tomSoul = new Soul();
        Soul jerrySoul = new Soul();
        tomSoul.recordMemory(tom);
        jerrySoul.recordMemory(jerry);

        tom.addStory("lived in Nanchang for four years.");
        jerry.addStory("lived in Nanchang for four years.");
        System.out.println(tom);
        System.out.println(jerry);

        tomSoul.rollbackMemory(tom);
        jerrySoul.rollbackMemory(jerry);
        System.out.println(tom);
        System.out.println(jerry);*/
    }
}
