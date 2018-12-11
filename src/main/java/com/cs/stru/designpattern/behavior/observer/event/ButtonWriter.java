package com.cs.stru.designpattern.behavior.observer.event;

/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 5:32
 */
public class ButtonWriter extends Writer{
    private WriterListener writerListener;

    public ButtonWriter(String name) {
        super(name);
    }

    public void setWriterListener(WriterListener writerListener) {
        this.writerListener = writerListener;
    }

    /**
     * publish/update/publish
     */
    public void publish() {
        writerListener.listen(new WriterEven(this));
    }
}
