package com.cs.stru.designpattern.behavior.observer.event;

import java.util.HashSet;
import java.util.Set;

/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 2:38
 */
public class Writer {
    private String name;
    private String lastPublisherName;
    private Set<WriterListener> writerListenerSet = new HashSet<>();

    public Writer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastPublisherName() {
        return lastPublisherName;
    }

//    public void publish(String lastNovelName) {
//        System.out.println(getName() + " publish new utils,named:" + lastNovelName);
//        this.lastPublisherName = lastNovelName;
//        setChanged();
//        notifyObservers();
//    }

    public void publish(String lastPublisherName) {
        System.out.println(getName() + " publish new utils,named:" + lastPublisherName);
        this.lastPublisherName = lastPublisherName;
        triggerEvent();
    }

    private void triggerEvent() {
        WriterEven writerEven = new WriterEven(this);
        for (WriterListener writerListener : writerListenerSet) {
            writerListener.change(writerEven);
        }
    }

    public void addWriterListener(WriterListener writerListener) {
        writerListenerSet.add(writerListener);
    }

    public void removeWriterListener(WriterListener writerListener) {
        writerListenerSet.remove(writerListener);
    }
}
