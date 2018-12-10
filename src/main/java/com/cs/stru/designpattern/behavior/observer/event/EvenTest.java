package com.cs.stru.designpattern.behavior.observer.event;

/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 3:45
 *
 */
public class EvenTest {
    public static void main(String[] args) {
        Reader tom = new Reader("tom");
        Reader jerry = new Reader("jerry");
        Reader sari = new Reader("sari");

        Writer lea = new Writer("Doug Lea");
        Writer gosling = new Writer("James Gosling");

        WriterManager.getWriterManager().registerWriter(lea);
        WriterManager.getWriterManager().registerWriter(gosling);

        tom.subscribe("Doug Lea");
        tom.subscribe("Doug Lea");
        jerry.subscribe("Doug Lea");
        sari.subscribe("Doug Lea");

        tom.subscribe("James Gosling");
        jerry.subscribe("James Gosling");

        lea.publish("Concurrent");
        gosling.publish("Collection");
        System.out.println("---------------------------------------------");

        sari.unSubscribe("Doug Lea");
        lea.publish("ConcurrentV2");
        gosling.publish("CollectionV2");
    }
}
