package com.cs.stru.designpattern.behavior.memento.simple;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 3:47.
 */
public class MementoTest {

    /**
     * 记录之前的状态
     *
     * @param args
     */
    public static void main(String[] args) {
        Person tom = new Person("tom");
        Person jerry = new Person("jerry");

        tom.addStory("tom born in Hubei");
        tom.addStory("tom come from Qichun");

        jerry.addStory("jerry born in Jiangxi");
        jerry.addStory("jerry come from Nanchang");

        tom.addStory("lived in Nanchang for four years.");
        jerry.addStory("lived in Nanchang for four years.");

        System.out.println(tom);
        System.out.println(jerry);
    }
}
