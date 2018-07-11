package com.cs.stru.designpattern.structural.adapter;

/**
 * Created by benjaminChan on 2018/7/11 0011 下午 7:56.
 * alibaba 开发手册规范，测试类以Test结尾
 */
public class AdapterTest {

    /**
     * 适配器模式分为对象适配器和类适配器，一种采用继承，一种采用组合；
     *
     *  适配器模式是补救措施？Android的ListView
     * @param args
     */
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapter = new Adapter();
        adapter.request();

        Target objectAdapter = new ObjectAdapter(new Adaptee());
        objectAdapter.request();
    }
}
