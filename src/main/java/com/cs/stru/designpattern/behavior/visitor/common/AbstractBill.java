package com.cs.stru.designpattern.behavior.visitor.common;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 2:54.
 */
public abstract class AbstractBill implements Bill {

    protected double amount;

    protected String item;

    public AbstractBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
