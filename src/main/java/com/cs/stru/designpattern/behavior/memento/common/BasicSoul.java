package com.cs.stru.designpattern.behavior.memento.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 4:35.
 */
public class BasicSoul {

    private Map<Person, Memory> memoryMap = new HashMap<Person, Memory>();

    public void recordMemory(Person person) {
        memoryMap.put(person, person.getMemory());
    }

    public void rollbackMemory(Person person) {
        if (memoryMap.containsKey(person)) {
            person.setMemory(memoryMap.get(person));
        }
    }
}
