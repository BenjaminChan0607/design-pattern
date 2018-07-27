package com.cs.stru.designpattern.behavior.state.common;

import java.util.concurrent.TimeUnit;

/**
 * Created by benjaminChan on 2018/7/27 0027 上午 9:55.
 */
public class DizzinessState implements RunState {
    public void run(Hero hero) {
        System.out.println("晕眩状态");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hero.setState(Hero.COMMON);
        System.out.println("晕眩状态变成正常状态");
    }
}
