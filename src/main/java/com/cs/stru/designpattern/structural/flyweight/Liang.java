package com.cs.stru.designpattern.structural.flyweight;

/**
 * Created by benjaminChan on 2018/7/9 0009 下午 8:53.
 */
public class Liang extends AbstractHero {

    public void initSkills() {
        skills[0] = this.getClass().getSimpleName() + "-q";
        skills[1] = this.getClass().getSimpleName() + "-w";
        skills[2] = this.getClass().getSimpleName() + "-e";
        skills[3] = this.getClass().getSimpleName() + "-r";
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
