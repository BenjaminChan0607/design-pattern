package com.cs.stru.designpattern.pattern.delegation;


/**
 * @Date 2019/8/7 10:57
 * @Created by chending
 */
public class TeamLeader implements Worker {

    private Worker worker;

    public TeamLeader(Worker worker) {
        this.worker = worker;
    }

    @Override
    public void doWork() {
        worker.doWork();
    }
}
