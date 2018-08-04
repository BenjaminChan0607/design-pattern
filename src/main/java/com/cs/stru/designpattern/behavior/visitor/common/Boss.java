package com.cs.stru.designpattern.behavior.visitor.common;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 3:12.
 */
public class Boss extends AbstractViewer {

    private double totalIncome;
    private double totalConsume;

    public double getTotalIncome() {
        System.out.println("boss is coming.totalIncome:" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("boss is coming.totalConsume:" + totalConsume);
        return totalConsume;
    }

    void viewConsumeBill(ConsumeBill bill) {
        totalConsume += bill.getAmount();
    }

    void viewIncomeBill(IncomeBill bill) {
        totalIncome += bill.getAmount();
    }
}
