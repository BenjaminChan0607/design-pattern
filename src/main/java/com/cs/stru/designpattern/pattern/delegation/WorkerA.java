package com.cs.stru.designpattern.pattern.delegation;

/**
 * @Date 2019/8/7 10:58
 * @Created by chending
 */
public class WorkerA implements Worker {
    @Override
    public void doWork() {
        System.out.println("WorkerA do work");
    }
}
