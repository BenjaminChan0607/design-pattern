package com.cs.stru.designpattern.behavior.observer.event;

/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 2:38
 */
public class Reader implements WriterListener {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Override
    //    public void update(Observable o, Object arg) {
//        if (o instanceof Writer) {
//            Writer writer = (Writer) o;
//            System.out.println(getName() + " receive notify from publisher " + writer.getName() + ","  + writer.getLastPublisherName());
//        }
//    }

    public void subscribe(String writerName) {
        WriterManager.getWriterManager().getWriter(writerName).addWriterListener(this);
    }

    public void unSubscribe(String writerName) {
        WriterManager.getWriterManager().getWriter(writerName).removeWriterListener(this);
        System.out.println(getName() + " unSubscribe author " + writerName);
    }

    @Override
    public void listen(WriterEven writerEven) {
        Writer writer = writerEven.getWriter();
        System.out.println(getName() + " receive notify from publisher " + writer.getName() + "," + writer.getLastPublisherName());
    }
}
