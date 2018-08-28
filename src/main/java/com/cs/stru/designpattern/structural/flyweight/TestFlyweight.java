package com.cs.stru.designpattern.structural.flyweight;

import java.util.Arrays;

/**
 * Created by benjaminChan on 2018/7/9 0009 下午 8:38.
 */
public class TestFlyweight {

    /**
     * 定义：享元模式（英语：Flyweight Pattern）是一种软件设计模式。它使用共享物件，用来尽可能减少内存使用量以及分享资讯给尽可能多的相似物件；
     * 它适合用于当大量物件只是重复因而导致无法令人接受的使用大量内存。通常物件中的部分状态是可以分享。常见做法是把它们放在外部数据结构，当需要使用时再将它们传递给享元。
     * <p>
     * 享元模式强调内部状态和外部状态
     * 享元模式强调内部状态和外部状态
     * <p>
     * 内部状态可以是公共属性
     * 外部状态是特有的属性
     * <p>
     * 由于共用内部状态，可以避免过多实例化对象的内存消耗
     */

    public static void main(String[] args) {
        Liang liang = new Liang();
        Yu yu = new Yu();

        System.out.println(Arrays.asList(liang.skills));
        System.out.println(Arrays.asList(yu.skills));

        HeroManager heroManager = HeroManager.getHeroManager();

        AbstractHero abstractHero1 = heroManager.getHero("Liang");
        AbstractHero abstractHero2 = heroManager.getHero("Yu");
        System.out.println(heroManager.heroMap.size());

        RoleStatus roleStatus1 = new RoleStatus(abstractHero1);
        RoleStatus roleStatus2 = new RoleStatus(abstractHero2);

        RoleStatus roleStatus3 = new RoleStatus(abstractHero1);
        RoleStatus roleStatus4 = new RoleStatus(abstractHero2);

        System.out.println(abstractHero1);
        System.out.println(abstractHero2);

        System.out.println(roleStatus1);
        System.out.println(roleStatus2);
        System.out.println(roleStatus3);
        System.out.println(roleStatus4);
    }
}
