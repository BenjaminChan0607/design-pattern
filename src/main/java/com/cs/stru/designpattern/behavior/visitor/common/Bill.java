package com.cs.stru.designpattern.behavior.visitor.common;

/**
 * Created by benjaminChan on 2018/7/30 0030 下午 2:04.
 */
public interface Bill {

    void accept(Viewer viewer);
}
