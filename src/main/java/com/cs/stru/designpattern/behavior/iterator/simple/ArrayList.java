package com.cs.stru.designpattern.behavior.iterator.simple;

import java.util.Arrays;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 5:01.
 */
public class ArrayList<E> {

    private static final int INCREMENT = 10;

    private E[] array = (E[]) new Object[INCREMENT];

    private int size;

    public void add(E e) {
        if (size < array.length) {
            array[size++] = e;
        } else {
            E[] tmp = Arrays.copyOf(array, array.length + INCREMENT);
            tmp[size++] = e;
            array = tmp;
        }
    }

    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }

    public int getSize() {
        return size;
    }
}
