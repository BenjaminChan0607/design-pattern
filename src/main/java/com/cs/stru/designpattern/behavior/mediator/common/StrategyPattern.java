package com.cs.stru.designpattern.behavior.mediator.common;

public class StrategyPattern extends Pattern {

    public StrategyPattern(PatternAlliance patternAlliance) {
        super(patternAlliance);
    }
    public String getName() {
        return getClass().getSimpleName();
    }
}
