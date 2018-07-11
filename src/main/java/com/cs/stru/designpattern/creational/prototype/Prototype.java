package com.cs.stru.designpattern.creational.prototype;

/**
 * Created by benjaminChan on 2018/7/9 0009 下午 7:02.
 */
public class Prototype implements Cloneable{

    private int a,b,c;
    private String str;
    public Field field;

    public void setStr(String str) {
        this.str = str;
    }

    public Prototype(){
        this.a = 1;
        this.b = 2;
        this.c = 3;
        str = "str";
        field = new Field();
        field.setA(10);
    }

    public void change() {
        this.a = 9;
        this.b = 8;
        this.c = 7;
    }

    @Override
    public Prototype clone(){
        Object object = null;
        try {
            object = super.clone();
            ((Prototype)object).field = this.field.clone();
//            ((Prototype)object).str = this.str;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Prototype) object;
    }

    /*    @Override
    public Prototype clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Prototype) object;
    }*/

    /*    protected Prototype clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Prototype) object;
    }*/

    @Override
    public String toString() {
        return "Prototype{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", str='" + str + '\'' +
                ", field=" + field +
                '}';
    }
}
