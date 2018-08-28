package com.cs.stru.designpattern.structural.adapter;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by benjaminChan on 2018/7/11 0011 下午 8:02.
 * 类适配器基于继承
 * 对象适配器基于组合
 * <p>
 * 如何需要适配的对象是两个类的话，而java又是单继承，所以采用组合的方式
 */
public class HashMapObserverAdapter<K, V> extends HashMap<K, V> implements Observer {

    public void update(Observable o, Object arg) {
        super.clear();
    }
}
