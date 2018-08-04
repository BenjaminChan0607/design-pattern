package com.cs.stru.designpattern.behavior.visitor.common;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 2:40.
 */
public class Demo {

    /**
     * 分派：静态分派，多分派
     *
     * 静态分派：数个数和参数类型（重载）
     * JAVA是静态多分派的语言
     *
     * 动态分派：多态的特性（重写）
     * JAVA是动态单分派的语言
     * @param args
     */
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show("1");
        demo.show(1);
    }

    public void show(String string) {
        System.out.println("string");
    }

    public void show(Integer integer) {
        System.out.println("integer");
    }
}
