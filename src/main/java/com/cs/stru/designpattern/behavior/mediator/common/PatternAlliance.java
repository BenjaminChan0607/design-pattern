package com.cs.stru.designpattern.behavior.mediator.common;

public interface PatternAlliance {

    void add(Pattern pattern);

    void attack(Pattern attacker, Pattern defense);

    void defend(Pattern defense);
}
