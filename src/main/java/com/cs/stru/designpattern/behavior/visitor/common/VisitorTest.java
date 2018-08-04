package com.cs.stru.designpattern.behavior.visitor.common;


/**
 * Created by benjaminChan on 2018/7/30 0030 下午 3:16.
 */
public class VisitorTest {

    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();
        accountBook.addBill(new IncomeBill(10000, "卖流量"));
        accountBook.addBill(new IncomeBill(12000, "卖数据"));

        accountBook.addBill(new ConsumeBill(8000, "工资"));
        accountBook.addBill(new ConsumeBill(9000, "发工资"));

        Viewer boss = new Boss();
        Viewer cpa = new CPA();

        accountBook.show(boss);
        accountBook.show(cpa);

        System.out.println(((Boss) boss).getTotalConsume() + "," + ((Boss) boss).getTotalIncome());
    }
}
