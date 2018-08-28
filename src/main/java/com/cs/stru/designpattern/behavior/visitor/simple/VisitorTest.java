package com.cs.stru.designpattern.behavior.visitor.simple;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 1:44.
 */
public class VisitorTest {

    /**
     * 定义（源于GoF《Design Pattern》）：表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素类的前提下定义作用于这些元素的新操作
     *
     * @param args
     */
    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();
        accountBook.addBill(new IncomeBill(10000, "卖流量"));
        accountBook.addBill(new IncomeBill(12000, "卖数据"));

        accountBook.addBill(new ConsumeBill(8000, "工资"));
        accountBook.addBill(new ConsumeBill(9000, "发工资"));

        AccountBookViewer boss = new Boss();
        AccountBookViewer cpa = new CPA();

        accountBook.show(boss);
        accountBook.show(cpa);

        System.out.println(((Boss) boss).getTotalConsume() + "," + ((Boss) boss).getTotalIncome() + "," + ((CPA) cpa));
    }
}
