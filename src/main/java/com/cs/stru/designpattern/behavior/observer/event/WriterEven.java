package com.cs.stru.designpattern.behavior.observer.event;

/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 3:54
 */
public class WriterEven{

    protected Object source;

    public WriterEven(Object source) {
        this.source = source;
    }

    public Writer getWriter() {
        return (Writer) source;
    }
}
