package com.cs.stru.designpattern.behavior.mediator.common;

public class SingletonPattern extends Pattern {

    public SingletonPattern(PatternAlliance patternAlliance) {
        super(patternAlliance);
    }
    public String getName() {
        return getClass().getSimpleName();
    }
}
