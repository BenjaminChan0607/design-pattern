package com.cs.stru.designpattern.extra.algorithm.common;

public class LinkLoop {

    public static class Node{
        private Object data;
        public Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(Object data) {
            this.data = data;
        }
    }

    public boolean isLoop(Node node) {
        Node slow = node;
        Node fast = node.next;

        while (slow.next != null) {
            Object slowData = slow.data;
            Object fastData = fast.data;

            if (slowData == fastData) {
                return true;
            }

            if (fast.next == null) {
                return false;
            }
        }
        return false;
    }
}
