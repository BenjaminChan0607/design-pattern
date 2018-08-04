package com.cs.stru.designpattern.behavior.visitor.common;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 3:15.
 */
public class CPA extends AbstractViewer {

    void viewConsumeBill(ConsumeBill bill) {
        if ("工资".equals(bill.getItem())) {
            System.out.println("工资是否交税了");
        }
    }

    void viewIncomeBill(IncomeBill bill) {
        System.out.println("查看是否交税了");
    }
}
