package com.cs.stru.designpattern.structural.bridge;

/**
 * Created by benjaminChan on 2018/7/10 0010 下午 7:34.
 */
public class ConcreteBridge extends Bridge {

    public void doAllLikePeople() {
        System.out.println(this.getClass().getSimpleName() + "-" + "doAllLikePeople");
    }
}
