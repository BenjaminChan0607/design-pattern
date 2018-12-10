package com.cs.stru.designpattern.behavior.observer.button;

import java.util.EventListener;

/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 4:49
 */
public interface ClickListener extends EventListener {
    void click(ClickEvent clickEvent);
}
