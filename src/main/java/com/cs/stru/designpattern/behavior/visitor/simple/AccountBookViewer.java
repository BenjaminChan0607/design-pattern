package com.cs.stru.designpattern.behavior.visitor.simple;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 2:02.
 */
public interface AccountBookViewer {

    void view(ConsumeBill consumeBill);

    void view(IncomeBill incomeBill);

}
