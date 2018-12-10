package com.cs.stru.designpattern.behavior.observer.common;

/**
 * Created by benjaminChan on 2018/7/12 0012 下午 7:54.
 */
public class Test {

    public static void main(String[] args) {
//假设四个读者，两个作者
        Reader r1 = new Reader("tom");
        Reader r2 = new Reader("jerry");
        Reader r3 = new Reader("ben");
        Reader r4 = new Reader("sari");
        Writer w1 = new Writer("xiaomi");
        Writer w2 = new Writer("huawei");

        Platform.getInstance().publish(w1);
        Platform.getInstance().publish(w2);
        //四人关注了xiaomi
        r1.subScribe("xiaomi");
        r2.subScribe("xiaomi");
        r3.subScribe("xiaomi");
        r4.subScribe("xiaomi");
        //ben和sari还关注了huawei
        r3.subScribe("huawei");
        r4.subScribe("huawei");

        //作者发布新书就会通知关注的读者
        //xiaomi写了设计模式
        w1.addNovel("设计模式");
        //huawei写了JAVA编程思想
        w2.addNovel("JAVA编程思想");
        //tom取消关注xiaomi
//        r1.unSubScribe("xiaomi");
//        //xiaomi再写书将不会通知tom
//        w1.addNovel("观察者模式");
    }
}
