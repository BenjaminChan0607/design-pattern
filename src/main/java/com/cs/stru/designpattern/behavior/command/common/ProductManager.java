package com.cs.stru.designpattern.behavior.command.common;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private static final int TASK_NUMBER = 4;

    private List<Task> taskList;

    private List<Programmer> programmerList;

    public ProductManager() {
        taskList = new ArrayList<Task>();
        programmerList = new ArrayList<Programmer>();
    }

    public void receive(Task task) {
        taskList.add(task);
    }

    public void addProgramer(Programmer programmer) {
        programmerList.add(programmer);
    }

    private int currentIndex;

    public Programmer assignProgramer() {
        return programmerList.get(currentIndex == programmerList.size() ? 0 : currentIndex++);
    }

    public void assign() {
        for (int i = 0; i < taskList.size() && i < TASK_NUMBER; i++) {
            taskList.get(i).hanlde();
        }
        if (taskList.size() > TASK_NUMBER) {
            taskList = taskList.subList(TASK_NUMBER, taskList.size());
        } else {
            taskList = new ArrayList<Task>();
        }
    }

    public void printTaskList() {
        if (taskList.size() < 0) {
            System.out.println("当前没有任务");
        }
        System.out.println("当前剩余的任务数：" + taskList.size());
        for (Task task : taskList) {
            System.out.println(task);
        }
    }
}
