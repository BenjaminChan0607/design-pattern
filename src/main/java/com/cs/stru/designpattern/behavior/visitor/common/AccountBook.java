package com.cs.stru.designpattern.behavior.visitor.common;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 2:12.
 */
public class AccountBook {

    private List<Bill> billList = new ArrayList<Bill>();

    public void addBill(Bill bill) {
        billList.add(bill);
    }

    /**
     * 查看者查看账本，账本被查看着查看
     *
     * @param accountBookViewer
     */
    public void show(Viewer accountBookViewer) {
        for (Bill bill : billList) {
            bill.accept(accountBookViewer);
        }
    }
}
