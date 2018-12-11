package com.cs.stru.designpattern.behavior.observer.event;


/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 5:21
 */
public class ButtonWriterTest {
    private ButtonWriter buttonWriter;

    public ButtonWriterTest() {
        buttonWriter = new ButtonWriter("submit");
        buttonWriter.setWriterListener(new WriterListener() {
            @Override
            public void listen(WriterEven writerEven) {
                Writer writer = writerEven.getWriter();
                System.out.println("monitor publish from publisher " + writer.getName());
                System.out.println("monitor publish from publisher " + writer.getName() + "," + writer.getLastPublisherName());
            }
        });
    }

    public ButtonWriter getButtonWriter() {
        return buttonWriter;
    }

    public static void main(String[] args) {
        ButtonWriterTest buttonWriterTest = new ButtonWriterTest();
        ButtonWriter buttonWriter = buttonWriterTest.getButtonWriter();
        buttonWriter.publish();
    }
}
