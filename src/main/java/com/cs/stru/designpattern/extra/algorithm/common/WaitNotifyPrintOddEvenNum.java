package com.cs.stru.designpattern.extra.algorithm.common;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author BenjaminChan
 * @data 2018/12/2 21:35
 */
public class WaitNotifyPrintOddEvenNum {
    private volatile boolean flag = true;
    private static final int TOTAL_NUM = 100;
    private AtomicInteger atomicInteger = new AtomicInteger(1);

    public static void main(String[] args) {
        WaitNotifyPrintOddEvenNum waitNotifyPrintOddEvenNum = new WaitNotifyPrintOddEvenNum();
        waitNotifyPrintOddEvenNum.test();
    }

    private void test() {
        Thread oddThread = new Thread(new OddNum());
        Thread evenThread = new Thread(new EvenNum());

        oddThread.start();
        evenThread.start();
    }

    private class OddNum implements Runnable {

        @Override
        public void run() {
            while (atomicInteger.get() < TOTAL_NUM) {
                synchronized (WaitNotifyPrintOddEvenNum.class) {
                    if (flag) {
                        System.out.println("OddNum:" + atomicInteger.get());

                        flag = false;
                        atomicInteger.getAndIncrement();
                        WaitNotifyPrintOddEvenNum.class.notify();
                    }
                }

            }
        }
    }

    private class EvenNum implements Runnable {

        @Override
        public void run() {
            while (atomicInteger.get() < TOTAL_NUM) {
                synchronized (WaitNotifyPrintOddEvenNum.class) {
                    if (!flag) {
                        System.out.println("EvenNum:" + atomicInteger.get());

                        flag = true;
                        atomicInteger.getAndIncrement();
                        WaitNotifyPrintOddEvenNum.class.notify();
                    }
                }

            }
        }
    }
}
