package com.cs.stru.designpattern.structural.facade;

/**
 * Created by benjaminChan on 2018/7/9 0009 下午 8:15.
 */
public class FacadeImpl implements Facade {

    private Sub1 sub1;
    private Sub2 sub2;
    private Sub3 sub3;

    public FacadeImpl() {
        sub1 = new Sub1Impl();
        sub2 = new Sub2Impl();
        sub3 = new Sub3Impl();
    }

    public void functon12() {
        sub1.function1();
        sub2.function2();
    }

    public void function23() {
        sub2.function2();
        sub3.function3();
    }

    public void function123() {
        sub1.function1();
        sub2.function2();
        sub3.function3();
    }
}
