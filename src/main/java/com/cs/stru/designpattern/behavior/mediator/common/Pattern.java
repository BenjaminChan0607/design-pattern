package com.cs.stru.designpattern.behavior.mediator.common;

public abstract class Pattern {

    protected PatternAlliance patternAlliance;

    public Pattern(PatternAlliance patternAlliance) {
        this.patternAlliance = patternAlliance;
    }

    public void attackedByPatternAlliance(Pattern pattern) {
        patternAlliance.attack(this,pattern);
    }

    public void defendedByPatternAlliance() {
        patternAlliance.defend(this);
    }

    public abstract String getName();

    public void attack(Pattern pattern) {
        System.out.println(getName() + " attack " + pattern.getName());
    }

    public void defend() {
        System.out.println(getName() + " defend");
    }
}
