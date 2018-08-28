package com.cs.stru.designpattern.behavior.visitor.common;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 2:04.
 */
public class IncomeBill extends AbstractBill {

    public IncomeBill(double amount, String item) {
        super(amount, item);
    }

    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer) viewer).viewIncomeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }
}
