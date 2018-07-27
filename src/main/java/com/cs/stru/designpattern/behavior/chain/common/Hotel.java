package com.cs.stru.designpattern.behavior.chain.common;

/**
 * Created by benjaminChan on 2018/7/27 0027 下午 3:15.
 */
public interface Hotel {

    void setNextHotel(Hotel hotel);

    boolean handleOrder(Order order);
}