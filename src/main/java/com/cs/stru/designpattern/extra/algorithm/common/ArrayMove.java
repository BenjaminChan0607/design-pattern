package com.cs.stru.designpattern.extra.algorithm.common;

import org.junit.Test;

import java.util.Arrays;

/**
 * 数组移位，开辟新数组直接赋值，不开辟新数组则多次倒置
 *
 * @author benjaminChan
 * @date 2018/11/23 0023 上午 9:57
 */
public class ArrayMove {

    @Test
    public void test() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int moveNum = 5;
//        arrayMoveUseArray(array, moveNum);
        arrayMoveCommon(array, moveNum);
    }

    private void arrayMoveCommon(int[] array, int moveNum) {
        System.out.println(Arrays.toString(array));

        int arrayLength = array.length;
        int num = moveNum % arrayLength;
        if (num < 0) {
            return;
        }

        for (int i = 0; i < arrayLength / 2; i++) {
            int temp = array[i];
            array[i] = array[arrayLength - 1 - i];
            array[arrayLength - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < num / 2; i++) {
            int temp = array[i];
            array[i] = array[num - 1 - i];
            array[num - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));
        for (int i = num; i < num + (arrayLength - num) / 2; i++) {
            int temp = array[i];
            array[i] = array[arrayLength - 1 - i + num];
            array[arrayLength - 1 - i + num] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

    private void arrayMoveUseArray(int[] array, int moveNum) {
        System.out.println(Arrays.toString(array));
        int arrayLength = array.length;

        int num = moveNum % arrayLength;

        int[] postArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            postArray[(i + num) % arrayLength] = array[i];
            System.out.println(Arrays.toString(postArray));
        }
        System.out.println(Arrays.toString(postArray));
    }

    @Test
    public void testConvert() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
