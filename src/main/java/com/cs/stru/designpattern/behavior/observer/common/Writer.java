package com.cs.stru.designpattern.behavior.observer.common;

import java.util.Observable;

/**
 * Created by benjaminChan on 2018/7/12 0012 下午 8:16.
 */
public class Writer extends Observable {

    private String name;
    private String lastNovel;

    public Writer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastNovel() {
        return lastNovel;
    }

    public void addNovel(String novel) {
        System.out.println(name + " publish new" + novel);
        lastNovel = novel;
        setChanged();
        notifyObservers();
    }
}
