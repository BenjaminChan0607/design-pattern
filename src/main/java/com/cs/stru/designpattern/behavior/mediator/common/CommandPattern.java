package com.cs.stru.designpattern.behavior.mediator.common;

public class CommandPattern extends Pattern {

    public CommandPattern(PatternAlliance patternAlliance) {
        super(patternAlliance);
    }
    public String getName() {
        return getClass().getSimpleName();
    }
}
