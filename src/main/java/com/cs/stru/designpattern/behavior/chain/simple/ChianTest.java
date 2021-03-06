package com.cs.stru.designpattern.behavior.chain.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by benjaminChan on 2018/7/26 0026 下午 7:02.
 */
public class ChianTest {

    /**
     * 定义：为了避免请求的发送者和接收者之间的耦合关系，使多个接受对象都有机会处理请求。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
     * <p>
     * 定义：为了避免请求的发送者和接受者之间的耦合关系，使得多个接收对象都有机会处理请求。
     *
     * @param args
     */
    public static void main(String[] args) {
        //假设初始菜单都是以下这些东西
        Map<String, Integer> menu = new HashMap<String, Integer>();
        menu.put("汉堡", 5);
        menu.put("薯条", 5);
        menu.put("可乐", 5);
        menu.put("雪碧", 5);
        //假设有5个分店
        Hotel hotel1 = new Hotel(0, 0, new HashMap<String, Integer>(menu));
        Hotel hotel2 = new Hotel(100, 120, new HashMap<String, Integer>(menu));
        Hotel hotel3 = new Hotel(-100, -120, new HashMap<String, Integer>(menu));
        Hotel hotel4 = new Hotel(1000, 20, new HashMap<String, Integer>(menu));
        Hotel hotel5 = new Hotel(-500, 0, new HashMap<String, Integer>(menu));

        List<Hotel> hotels = Arrays.asList(hotel1, hotel2, hotel3, hotel4, hotel5);

        //小左开始订餐，假设小左的坐标是900,20
        Map<String, Integer> order = new HashMap<String, Integer>();
        order.put("汉堡", 2);
        order.put("可乐", 1);
        order.put("薯条", 1);

        print(hotels);
        System.out.println("------------------------------------------");
        //小左开始一家一家挨着尝试订餐，直到成功
        for (Hotel hotel : hotels) {
            if (hotel.order(900, 20, order)) {
                System.out.println("订餐成功，接受订单的分店是：" + hotel);
                break;
            }
        }
        System.out.println("------------------------------------------");
        print(hotels);
    }

    public static void print(List<Hotel> hotels) {
        for (Hotel hotel : hotels) {
            System.out.println("[" + hotel + "]的菜单:" + hotel.getMenu());
        }
    }
}
