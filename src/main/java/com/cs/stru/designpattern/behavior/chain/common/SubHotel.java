package com.cs.stru.designpattern.behavior.chain.common;

import com.cs.stru.designpattern.behavior.chain.CommonUtils;

import java.util.Collections;
import java.util.Map;

/**
 * Created by benjaminChan on 2018/7/27 0027 下午 3:20.
 */
public class SubHotel implements Hotel {

    private final static int MIN_DISTANCE = 500;//假设是500米以内送餐

    private static int count;//类计数

    private final int number;//分店号

    private int x;//分店的横坐标，用于判断距离

    private int y;//分店的纵坐标，用于判断距离

    private Map<String, Integer> menu;//菜单

    private Hotel nextHotel;//下一家分店

    public SubHotel(int x, int y, Map<String, Integer> menu) {
        super();
        this.x = x;
        this.y = y;
        this.menu = menu;
        number = ++count;
    }

    //设置下一家分店
    public void setNextHotel(Hotel hotel) {
        this.nextHotel = hotel;
    }

    //按照职责链处理订单
    public boolean handleOrder(Order order) {
        //如果距离小于500米并且订单中的食物不缺货，则订单成功，否则失败
        if (CommonUtils.getDistance(order.getX(), order.getY(), this.x, this.y) < MIN_DISTANCE && !CommonUtils.outOfStock(menu, order.getOrder())) {
            for (String name : order.getOrder().keySet()) {
                menu.put(name, menu.get(name) - order.getOrder().get(name));
            }
            System.out.println("订餐成功，接受订单的分店是：" + this);
            return true;
        }
        if (nextHotel == null) {
            return false;
        }
        return nextHotel.handleOrder(order);
    }

    public Map<String, Integer> getMenu() {
        return Collections.unmodifiableMap(menu);
    }

    public Hotel getNextHotel() {
        return nextHotel;
    }

    public String toString() {
        return "麦当劳分店第" + number + "个";
    }


}