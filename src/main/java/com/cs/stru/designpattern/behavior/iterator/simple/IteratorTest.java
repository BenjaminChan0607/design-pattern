package com.cs.stru.designpattern.behavior.iterator.simple;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 4:55.
 */
public class IteratorTest {

    /**
     * 定义：提供一个方法来顺序的访问一个聚合对象中的各个元素，而不暴露对象的内部表示
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 11; i++) {
            arrayList.add(i);
        }

        Object[] arrayListObj = arrayList.toArray();
        for (Object object : arrayListObj) {
            System.out.println(object);
        }
        System.out.println("----------------------------------------------------------------------");

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 11; i++) {
            linkedList.add(i);
        }
        Object[] linkedListObj = linkedList.toArray();
        for (Object object : linkedListObj) {
            System.out.println(object);
        }
        System.out.println("----------------------------------------------------------------------");

        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < 11; i++) {
            hashSet.add(i);
        }
        Object[] hashSetObj = hashSet.toArray();
        for (Object object : hashSetObj) {
            System.out.println(object);
        }
        System.out.println("----------------------------------------------------------------------");
    }
}
