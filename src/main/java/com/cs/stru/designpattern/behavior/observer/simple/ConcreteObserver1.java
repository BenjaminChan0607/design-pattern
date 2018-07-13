package com.cs.stru.designpattern.behavior.observer.simple;

/**
 * Created by benjaminChan on 2018/7/12 0012 下午 7:40.
 */
public class ConcreteObserver1 implements Observer {
    public void update(Observable observable) {
        System.out.println(observable.getClass().getSimpleName() + "发生变化");
        System.out.println(observable.getClass().getSimpleName() + "做出响应");
    }
}
