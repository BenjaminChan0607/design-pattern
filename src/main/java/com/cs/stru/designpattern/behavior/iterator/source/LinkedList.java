package com.cs.stru.designpattern.behavior.iterator.source;

/**
 * @author benjaminChan
 * @date 2018/8/14 0014 下午 5:01
 */
public class LinkedList<E> {

    transient Node<E> first;
    transient Node<E> last;
    transient int size = 0;
    transient int modCount = 0;

    public LinkedList() {
    }

    private static class Node<E> {
        E value;
        private Node<E> pre;
        private Node<E> next;

        public Node(E value, Node<E> pre, Node<E> next) {
            this.value = value;
            this.pre = pre;
            this.next = next;
        }
    }

    public boolean add(E e) {
        Node<E> t = last;
        Node<E> newNode = new Node<E>(e, t, null);
        last = newNode;
        if (t == null) {
            first = newNode;
        } else {
            t.next = newNode;
        }
        size++;
        modCount++;
        return true;
    }
}
