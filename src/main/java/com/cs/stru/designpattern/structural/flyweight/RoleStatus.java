package com.cs.stru.designpattern.structural.flyweight;

/**
 * Created by benjaminChan on 2018/7/9 0009 下午 9:18.
 */
public class RoleStatus {

    private AbstractHero abstractHero;

    private long hp;
    private long mp;

    public RoleStatus(AbstractHero abstractHero) {
        this.abstractHero = abstractHero;
    }

    public void commonAttack() {
        abstractHero.commonAttack();
    }

    public void release(int index) {
        abstractHero.release(index);
    }

    public long getHp() {
        return hp;
    }

    public void setHp(long hp) {
        this.hp = hp;
    }

    public long getMp() {
        return mp;
    }

    public void setMp(long mp) {
        this.mp = mp;
    }
}
