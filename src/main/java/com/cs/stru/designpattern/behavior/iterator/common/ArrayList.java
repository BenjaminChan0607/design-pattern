package com.cs.stru.designpattern.behavior.iterator.common;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 5:01.
 */
public class ArrayList<E> implements Iterable<E> {

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

    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }


    public class Itr implements Iterator<E> {

        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor != size();
        }

        @Override
        public E next() {
            return array[cursor++];
        }

        @Override
        public void remove() {

        }
    }
}
