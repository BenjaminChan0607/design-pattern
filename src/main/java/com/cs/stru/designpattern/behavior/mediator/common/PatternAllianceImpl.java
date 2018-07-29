package com.cs.stru.designpattern.behavior.mediator.common;

import java.util.ArrayList;
import java.util.List;

public class PatternAllianceImpl implements PatternAlliance {

    public List<Pattern> patternList;

    public PatternAllianceImpl() {
        patternList = new ArrayList<Pattern>();
    }

    public void add(Pattern pattern) {
        patternList.add(pattern);
    }

    public void attack(Pattern attacker, Pattern defense) {
        if (patternList.contains(attacker)) {
            if (patternList.contains(defense)) {
                System.out.println(attacker.getName() + "," + defense.getName() + " 都在设计模式之中，不能对打");
            } else {
                System.out.println(attacker.getName() + "在并且" + defense.getName() + "不在，一起打" + defense.getName());
                for (Pattern pattern : patternList) {
                    pattern.attack(defense);
                }
            }
        } else {
            System.out.println(attacker.getName() + "不在设计模式之中，不管");
        }
    }

    public void defend(Pattern defense) {
        if (patternList.contains(defense)) {
            for (Pattern pattern : patternList) {
                pattern.defend();
            }
        } else {
            System.out.println(defense.getName() + "不在设计模式之中，不管");
        }
    }
}
