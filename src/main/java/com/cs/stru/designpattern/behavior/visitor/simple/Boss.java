package com.cs.stru.designpattern.behavior.visitor.simple;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 2:08.
 */
public class Boss implements AccountBookViewer {

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

    public void view(ConsumeBill consumeBill) {
        totalConsume += consumeBill.getAmount();
    }

    public void view(IncomeBill incomeBill) {
        totalIncome += incomeBill.getAmount();
    }
}
