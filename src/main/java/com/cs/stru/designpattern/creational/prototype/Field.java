package com.cs.stru.designpattern.creational.prototype;

/**
 * Created by benjaminChan on 2018/7/9 0009 下午 7:20.
 */
public class Field implements Cloneable {

    private int a;

    public Field clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Field) object;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
