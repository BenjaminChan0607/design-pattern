package com.cs.stru.designpattern.structural.bridge;

/**
 * Created by benjaminChan on 2018/7/10 0010 下午 5:47.
 */
public class TestBridge {

    /**
     * 定义：在软件系统中，某些类型由于自身的逻辑，它具有两个或多个维度的变化，那么如何应对这种“多维度的变化”？如何利用面向对象的技术来使得该类型能够轻松的沿着多个方向进行变化，
     * 而又不引入额外的复杂度？这就要使用Bridge模式。而具体使用的方式，则是将抽象部分与他们的实现部分分离，使得它们都可以独立的变化。
     * @param args
     */
    public static void main(String[] args) {
        Bridge bridge = new ConcreteBridge();
        bridge.setAppearance(new Handsome());
        bridge.setSkills(new InvisibleSkills());
        bridge.doAllLikePeople();

        bridge.show();
        bridge.releaseSkills();

        bridge.setSkills(new ReadMindSkills());
        bridge.releaseSkills();

        bridge.setSkills(new VolantSkills());
        bridge.releaseSkills();

        bridge.setAppearance(new Plain());
        bridge.show();
    }
}
