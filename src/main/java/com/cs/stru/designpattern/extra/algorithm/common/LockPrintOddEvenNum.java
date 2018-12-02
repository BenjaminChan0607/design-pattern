package com.cs.stru.designpattern.extra.algorithm.common;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author BenjaminChan
 * @data 2018/12/2 21:42
 */
public class LockPrintOddEvenNum {

    private volatile boolean flag = true;
    private static final int TOTAL_NUM = 100;
    private AtomicInteger atomicInteger = new AtomicInteger(1);
    private ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        LockPrintOddEvenNum lockPrintOddEvenNum = new LockPrintOddEvenNum();
        lockPrintOddEvenNum.test();
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
                if (flag) {
                    reentrantLock.lock();
                    System.out.println("OddNum:" + atomicInteger.get());

                    flag = false;
                    atomicInteger.getAndIncrement();
                    reentrantLock.unlock();
                }
            }
        }
    }

    private class EvenNum implements Runnable {

        @Override
        public void run() {
            while (atomicInteger.get() < TOTAL_NUM) {
                if (!flag) {
                    reentrantLock.lock();
                    System.out.println("EvenNum:" + atomicInteger.get());

                    flag = true;
                    atomicInteger.getAndIncrement();
                    reentrantLock.unlock();
                }
            }
        }
    }
}
