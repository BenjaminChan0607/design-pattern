package com.cs.stru.designpattern.behavior.chain.simple;

import com.cs.stru.designpattern.behavior.chain.CommonUtils;

import java.util.Collections;
import java.util.Map;

/**
 * Created by benjaminChan on 2018/7/26 0026 下午 7:06.
 */
public class Hotel {

    private final static int MIN_DISTANCE = 500;

    private static int count;
    private static int number;
    private int x;
    private int y;

    private Map<String, Integer> menu;

    public Hotel(int x, int y, Map<String, Integer> menu) {
        this.x = x;
        this.y = y;
        this.menu = menu;
    }

    public boolean order(int x, int y, Map<String, Integer> order) {
        number++;
        //如果距离小于500米并且订单中的食物不缺货，则订单成功，否则失败
        if (CommonUtils.getDistance(x, y, this.x, this.y) < MIN_DISTANCE && !CommonUtils.outOfStock(menu, order)) {
            for (String name : order.keySet()) {
                menu.put(name, menu.get(name) - order.get(name));
            }
            return true;
        } else {
            return false;
        }
    }

    public Map<String, Integer> getMenu() {
        return Collections.unmodifiableMap(menu);
    }

    public String toString() {
        return "Hotel第" + number + "个";
    }
}
