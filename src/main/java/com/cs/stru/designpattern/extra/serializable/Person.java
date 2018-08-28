package com.cs.stru.designpattern.extra.serializable;

import java.io.Serializable;

/**
 * @author benjaminChan
 * @date 2018/8/28 0028 下午 2:47
 */
public class Person implements Serializable {
    /**
     * 序列化ID
     */
    private int age;
    private String name;
    private String sex;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
