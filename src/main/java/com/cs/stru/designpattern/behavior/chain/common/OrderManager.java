package com.cs.stru.designpattern.behavior.chain.common;

/**
 * Created by benjaminChan on 2018/7/27 0027 下午 3:40.
 */
public class OrderManager {

    private static OrderManager orderManager = new OrderManager();

    private Hotel head;

    private Hotel last;

    private OrderManager() {
    }

    public static OrderManager getOrderManager() {
        return orderManager;
    }

    //注册分店
    public void registerSubbranch(Hotel... hotels) {
        for (Hotel hotel : hotels) {
            registerSubbranch(hotel);
        }
    }

    public void registerSubbranch(Hotel hotel) {
        if (head == null) {
            last = head = hotel;
        } else {
            last.setNextHotel(hotel);
            last = hotel;
        }
    }

    public boolean handleOrder(Order order) {
        return head.handleOrder(order);
    }

}