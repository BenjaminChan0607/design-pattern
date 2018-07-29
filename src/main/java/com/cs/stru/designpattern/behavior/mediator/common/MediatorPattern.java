package com.cs.stru.designpattern.behavior.mediator.common;

public class MediatorPattern extends Pattern {

    public MediatorPattern(PatternAlliance patternAlliance) {
        super(patternAlliance);
    }
    public String getName() {
        return getClass().getSimpleName();
    }
}
