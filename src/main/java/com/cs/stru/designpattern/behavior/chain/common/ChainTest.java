package com.cs.stru.designpattern.behavior.chain.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by benjaminChan on 2018/7/27 0027 下午 3:35.
 */
public class ChainTest {

    public static void main(String[] args) {
        //假设初始菜单都是以下这些东西
        Map<String, Integer> menu = new HashMap<String, Integer>();
        menu.put("汉堡", 5);
        menu.put("薯条", 5);
        menu.put("可乐", 5);
        menu.put("雪碧", 5);
        //假设有5个分店
        Hotel mcHotel1 = new SubHotel(0, 0, new HashMap<String, Integer>(menu));
        Hotel mcHotel2 = new SubHotel(100, 120, new HashMap<String, Integer>(menu));
        Hotel mcHotel3 = new SubHotel(-100, -120, new HashMap<String, Integer>(menu));
        Hotel mcHotel4 = new SubHotel(1000, 20, new HashMap<String, Integer>(menu));
        Hotel mcHotel5 = new SubHotel(-500, 0, new HashMap<String, Integer>(menu));

        //注册5个分店
        OrderManager.getOrderManager().registerSubbranch(mcHotel1, mcHotel2, mcHotel3, mcHotel4, mcHotel5);

        //小左开始订餐，假设小左的坐标是900,20
        Map<String, Integer> order = new HashMap<String, Integer>();
        order.put("汉堡", 2);
        order.put("可乐", 1);
        order.put("薯条", 1);

        print(mcHotel1);
        System.out.println("------------------------------------------");

        //小左开始订餐，直接找订餐管理部门订餐
        OrderManager.getOrderManager().handleOrder(new Order(900, 20, order));

        System.out.println("------------------------------------------");
        print(mcHotel1);
    }

    public static void print(Hotel hotel) {
        if (hotel == null) {
            return;
        }
        do {
            if (hotel instanceof SubHotel) {
                System.out.println("[" + hotel + "]的菜单:" + ((SubHotel) hotel).getMenu());
            }
        } while ((hotel = ((SubHotel) hotel).getNextHotel()) != null);
    }
}
