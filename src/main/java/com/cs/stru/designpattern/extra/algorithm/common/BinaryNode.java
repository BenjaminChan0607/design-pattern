package com.cs.stru.designpattern.extra.algorithm.common;

import lombok.*;
import org.junit.Test;

import java.util.LinkedList;

/**
 * @author benjaminChan
 * @date 2018/11/23 0023 上午 10:51
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BinaryNode {
    private Object data;
    private BinaryNode leftNode;
    private BinaryNode rightNode;

    public static BinaryNode getInstance() {
        BinaryNode rootNode = new BinaryNode(0, null, null);
        BinaryNode leftNode1 = new BinaryNode(1, null, null);
        BinaryNode rightNode1 = new BinaryNode(2, null, null);
        BinaryNode leftNode2 = new BinaryNode(3, null, null);
        BinaryNode rightNode2 = new BinaryNode(4, null, null);
        BinaryNode leftNode3 = new BinaryNode(5, null, null);
        BinaryNode rightNode3 = new BinaryNode(6, null, null);

        rootNode.setLeftNode(leftNode1);
        rootNode.setRightNode(rightNode1);

        leftNode1.setLeftNode(leftNode2);
        leftNode1.setRightNode(rightNode2);

        rightNode1.setLeftNode(leftNode3);
        rightNode1.setRightNode(rightNode3);

        return rootNode;
    }

    /**
     * 二叉树的层序遍历
     */
    public void levelIterator(BinaryNode binaryNode) {
        LinkedList<BinaryNode> queue = new LinkedList<>();
        queue.offer(binaryNode);

        BinaryNode current;
        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.println("data:" + current.getData());

            if (current.leftNode != null) {
                queue.add(current.leftNode);
                System.out.println("add left next:" + current.leftNode.getData());
            }
            if (current.rightNode != null) {
                queue.add(current.rightNode);
                System.out.println("add right next:" + current.rightNode.getData());
            }
            System.out.println("queue size:" + queue.size() + "," + queue.toString());
            System.out.println("-------------------------------");
        }
    }

    @Test
    public void test() {
        BinaryNode.getInstance().levelIterator(BinaryNode.getInstance());
    }
}
