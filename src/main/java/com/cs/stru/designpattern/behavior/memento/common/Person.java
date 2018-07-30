package com.cs.stru.designpattern.behavior.memento.common;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 3:50.
 */
public class Person {

    private String name;

    private List<String> storyList;

    public Person(String name) {
        this.name = name;
        storyList = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStory(String name) {
        storyList.add(name);
    }

    public List<String> getStoryList() {
        return Collections.unmodifiableList(storyList);
    }

    public Memory getMemory() {
        Memory memory = new Memory();
        memory.setStoryList(new ArrayList<String>(storyList));
//        memory.setStoryList(storyList);
        return memory;
    }

    public void setMemory(Memory memory) {
        storyList = memory.getStoryList();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (String str : storyList) {
            sb.append(str).append(",");
        }
        if (sb.length() > 0) {
            return sb.substring(0, sb.length() - 1);
        } else {
            return "";
        }
    }
}
