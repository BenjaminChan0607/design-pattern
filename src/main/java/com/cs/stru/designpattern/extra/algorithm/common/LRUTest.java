package com.cs.stru.designpattern.extra.algorithm.common;

import org.junit.Test;

import java.util.Map;

/**
 * @author benjaminChan
 * @date 2018/12/3 0003 下午 3:53
 */
public class LRUTest {
    @Test
    public void put() throws Exception {
        LRULinkedMap<String, Integer> map = new LRULinkedMap(3);
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);

        for (Map.Entry<String, Integer> e : map.getAll()) {
            System.out.print(e.getKey() + " : " + e.getValue() + "\t");
        }

        System.out.println("");
        map.put("4", 4);
        for (Map.Entry<String, Integer> e : map.getAll()) {
            System.out.print(e.getKey() + " : " + e.getValue() + "\t");
        }
    }
}
