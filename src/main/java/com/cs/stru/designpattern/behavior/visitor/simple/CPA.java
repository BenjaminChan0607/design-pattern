package com.cs.stru.designpattern.behavior.visitor.simple;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 2:10.
 */
public class CPA implements AccountBookViewer {

    public void view(ConsumeBill consumeBill) {
        if ("工资".equals(consumeBill.getItem())) {
            System.out.println("工资是否交税了");
        }
    }

    public void view(IncomeBill incomeBill) {
        System.out.println("查看是否交税了");
    }
}
