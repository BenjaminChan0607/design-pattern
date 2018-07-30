package com.cs.stru.designpattern.behavior.visitor.common;


/**
 * Created by benjaminChan on 2018/7/30 0030 下午 2:03.
 */
public class ConsumeBill extends AbstractBill {

    public ConsumeBill(double amount, String item) {
        super(amount, item);
    }

    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer) viewer).viewConsumeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }
}
