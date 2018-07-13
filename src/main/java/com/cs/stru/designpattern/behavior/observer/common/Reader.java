package com.cs.stru.designpattern.behavior.observer.common;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by benjaminChan on 2018/7/12 0012 下午 8:11.
 */
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void subScribe(String writerName) {
        Platform.getInstance().getWriter(writerName).addObserver(this);
    }

    public void unSubScribe(String writerName) {
        Platform.getInstance().getWriter(writerName).deleteObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof Writer) {
            Writer writer = (Writer) o;
            System.out.println(name + " know " + writer.getName() + " publish new book" + writer.getLastNovel());
        }
    }
}
