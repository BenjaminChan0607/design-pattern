package com.cs.stru.designpattern.extra.algorithm.common;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Function: 判断一个数字是否为快乐数字 19 就是快乐数字  11就不是快乐数字
 * 19
 * 1*1+9*9=82
 * 8*8+2*2=68
 * 6*6+8*8=100
 * 1*1+0*0+0*0=1
 *
 * @author benjaminChan
 * @date 2018/11/23 0023 下午 1:40
 */
public class HappyNum {

    private static final int DECIMAL = 10;

    public boolean isHappyNumber(int number) {
        if (number < 0) {
            return false;
        }

        Set<Integer> hashSet = new HashSet<>();
        while (number != 1) {
            int sum = 0;

            while (number > 0) {
                sum += (number % 10) * (number % 10);
                number = number / 10;
            }

            if (hashSet.contains(sum)) {
                return false;
            }
            hashSet.add(sum);
            number = sum;
        }
        return true;
    }

    @Test
    public void test() {
        System.out.println(isHappyNumber(28));
        System.out.println(isHappyNumber(32));
        System.out.println(isHappyNumber(37));
    }
}
