package com.cs.stru.designpattern.behavior.observer.button;

import java.util.EventListener;

/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 4:53
 */
public interface MouseMoveListener extends EventListener {
    void mouseMove(MouseMoveEvent event);
}
