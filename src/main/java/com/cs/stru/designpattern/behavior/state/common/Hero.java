package com.cs.stru.designpattern.behavior.state.common;

/**
 * Created by benjaminChan on 2018/7/27 0027 上午 9:47.
 */
public class Hero {

    public static final RunState COMMON = new CommonState();
    public static final RunState SPEED_UP = new SpeedUpState();
    public static final RunState SPEED_DOWN = new SpeedDownState();
    public static final RunState DIZZINESS = new DizzinessState();

    private RunState state = COMMON;
    private Thread thread;

    public void setState(RunState state) {
        this.state = state;
    }

    private boolean running() {
        return thread != null && !thread.isInterrupted();
    }

    public void startRun() {
        final Hero hero = this;
        thread = new Thread(new Runnable() {
            public void run() {
                while (!thread.isInterrupted()) {
                    state.run(hero);
                }
            }
        });
        thread.start();
        System.out.println("开始跑动");
    }

    public void stopRun() {
        thread.interrupt();
        System.out.println("停止跑动");
    }
}
