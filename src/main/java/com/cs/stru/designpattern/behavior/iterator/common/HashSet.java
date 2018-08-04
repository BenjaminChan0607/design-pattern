package com.cs.stru.designpattern.behavior.iterator.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 7:06.
 */
public class HashSet<E> implements Iterable<E> {

    private static final Object obj = new Object();

    private Map<E, Object> map = new HashMap<E, Object>();

    public void add(E e) {
        map.put(e, obj);
    }

    public int size() {
        return map.size();
    }

    public Object[] toArray() {
        return map.keySet().toArray();
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }
}
