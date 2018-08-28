package com.cs.stru.designpattern.creational.prototype;

/**
 * Created by benjaminChan on 2018/7/9 0009 下午 7:00.
 */
public class TestPrototype {

    /**
     * 定义：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
     * <p>
     * 实现Cloneable接口便可以用clone方法来实现对象的拷贝
     * <p>
     * 浅拷贝：clone方法执行的就是
     * 深拷贝：实现了Cloneable接口并重写了clone()方法的类中，所有的引用类型也需要实现Cloneable接口并重写clone()方法，并且将引用类型的属性都拷贝一遍；
     * <p>
     * Person name,age;
     *
     * @param args
     */
    public static void main(String[] args) {
        new TestPrototype().test();
    }

    private void test() {
        Prototype prototype = new Prototype();
        System.out.println(prototype);

        prototype.change();

        Prototype prototype2 = prototype.clone();
        /**
         * clone方法执行的是浅拷贝，拷贝方法的时候，构造方法是不被执行的；
         *
         * 原型模式常使用于以下场景：
         1，对象的创建非常复杂时可使用原型模式快速创建对象。

         2，在运行过程中不知道对象的具体类型，可使用原型模式创建一个相同类型的对象，或者在运行过程中动态的获取到一个对象的状态。
         */
        System.out.println(prototype2);

        prototype.setStr("prototype");
        System.out.println(prototype);
        System.out.println(prototype2);

//        prototype.field.setA(100);
//        System.out.println(prototype);
//        System.out.println(prototype2);
    }
}
