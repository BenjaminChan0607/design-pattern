package com.cs.stru.designpattern.behavior.observer.button;

/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 4:46
 */
public class MouseMoveEvent extends ButtonEvent {
    public MouseMoveEvent(Object source) {
        super(source);
    }

    //鼠标移动事件比较特殊，因为它需要告诉监听器鼠标当前的坐标是在哪，我们记录为x,y
    private int x;
    private int y;

    public MouseMoveEvent(Object source, int x, int y) {
        super(source);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
