package com.cs.stru.designpattern.behavior.observer.button;

/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 4:40
 */
public class ButtonEvent extends EventObject {

    public ButtonEvent(Object source) {
        super(source);
    }

    public Button getButton() {
        return (Button) getSource();
    }
}
