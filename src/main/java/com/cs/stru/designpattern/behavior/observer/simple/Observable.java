package com.cs.stru.designpattern.behavior.observer.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by benjaminChan on 2018/7/12 0012 下午 7:38.
 * <p>
 * 被观察者
 */
public class Observable {

    List<Observer> list = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        list.add(observer);
    }

    public void change() {
        System.out.println("我是被观察者，我发生了变化");
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : list) {
            observer.update(this);
        }
    }
}
