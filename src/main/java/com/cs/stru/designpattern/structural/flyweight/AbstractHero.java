package com.cs.stru.designpattern.structural.flyweight;

/**
 * Created by benjaminChan on 2018/7/9 0009 下午 8:44.
 */
public abstract class AbstractHero {

    protected final String name;
    protected final String[] skills = new String[4];

    public AbstractHero() {
        this.name = getName();
        initSkills();
        checkSkills();
    }

    public void release(int index) {
        System.out.println(skills[index]);
    }

    public void commonAttack() {
        System.out.println("commonAttack.");
    }

    private void checkSkills() {
        for (int i = 0; i < skills.length; i++) {
            if (skills[i] == null) {
                throw new NullPointerException();
            }
        }
    }

    public abstract void initSkills();

    public abstract String getName();
}