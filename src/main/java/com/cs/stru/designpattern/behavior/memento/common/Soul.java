package com.cs.stru.designpattern.behavior.memento.common;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 4:20.
 */
public class Soul {
    private Memory memory;

    //抽离或者说搜集一个人的记忆
    public void recordMemory(Person person) {
        memory = person.getMemory();
    }

    //强行将一个人的记忆固定在某一刻，可能空指针
    public void rollbackMemory(Person person) {
        person.setMemory(memory);
    }
}
