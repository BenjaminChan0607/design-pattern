package com.cs.stru.designpattern.behavior.visitor.simple;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 2:03.
 */
public class ConsumeBill implements Bill {

    private double amount;
    private String item;

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

    public ConsumeBill(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public void accept(AccountBookViewer accountBookViewer) {
        accountBookViewer.view(this);
    }
}
