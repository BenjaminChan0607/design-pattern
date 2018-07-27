package com.cs.stru.designpattern.behavior.state.common;

import java.util.concurrent.TimeUnit;

/**
 * Created by benjaminChan on 2018/7/27 0027 上午 10:08.
 */
public class StateTest {

    public static void main(String[] args) throws InterruptedException {
        Hero hero = new Hero();
        hero.startRun();
        hero.setState(Hero.SPEED_UP);
        TimeUnit.SECONDS.sleep(2);
        hero.setState(Hero.SPEED_DOWN);
        TimeUnit.SECONDS.sleep(2);
        hero.setState(Hero.DIZZINESS);
        TimeUnit.SECONDS.sleep(2);
        hero.stopRun();
    }
}
