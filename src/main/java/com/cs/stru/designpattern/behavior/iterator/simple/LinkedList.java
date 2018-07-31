package com.cs.stru.designpattern.behavior.iterator.simple;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 5:13.
 */
public class LinkedList<E> {

    private Entry<E> header = new Entry<E>(null, null, null);
    private int size;

    public LinkedList() {
        header.pre = header.next = header;
    }

    public void add(E e) {
        Entry<E> eEntry = new Entry<E>(e, header, header.next);
        eEntry.pre.next = eEntry;
        eEntry.next.pre = eEntry;
        size++;
    }

    public int size() {
        return size;
    }

    public Object[] toArray() {
        Object[] objects = new Object[size];
        int i = size - 1;
        for (Entry<E> e = header.next; e != header; e = e.next) {
            objects[i--] = e.value;
        }
        return objects;
    }

    private static class Entry<E> {
        E value;
        Entry<E> pre;
        Entry<E> next;

        public Entry(E value, Entry<E> pre, Entry<E> next) {
            this.value = value;
            this.pre = pre;
            this.next = next;
        }
    }
}