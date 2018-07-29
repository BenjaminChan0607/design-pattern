package com.cs.stru.designpattern.behavior.mediator.common;

public class MediatorTest {

    public static void main(String[] args) {
        PatternAlliance patternAlliance = new PatternAllianceImpl();

        Pattern singleton = new SingletonPattern(patternAlliance);
        Pattern command = new CommandPattern(patternAlliance);
        Pattern mediator = new MediatorPattern(patternAlliance);
        Pattern strategy = new StrategyPattern(patternAlliance);

        patternAlliance.add(singleton);
        patternAlliance.add(command);
        patternAlliance.add(mediator);

        singleton.attackedByPatternAlliance(mediator);
        command.attackedByPatternAlliance(mediator);
        System.out.println("-----------------------------------------------");

        singleton.attackedByPatternAlliance(strategy);
        System.out.println("-----------------------------------------------");
        strategy.attackedByPatternAlliance(singleton);
        System.out.println("-----------------------------------------------");

        mediator.defendedByPatternAlliance();
        System.out.println("-----------------------------------------------");
    }
}
