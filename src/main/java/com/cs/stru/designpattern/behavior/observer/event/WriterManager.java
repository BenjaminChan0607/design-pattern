package com.cs.stru.designpattern.behavior.observer.event;


import java.util.HashMap;
import java.util.Map;

/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 2:40
 * <p>
 * 管理平台：用来注册被观察者，可以看成是头条的入驻作者，观察者可以看成是用户
 */
public class WriterManager {
    private Map<String, Writer> map = new HashMap<>();

    private WriterManager() {
    }

    public static WriterManager getWriterManager() {
        return PlatformManager.instance;
    }

    private static class PlatformManager {
        private static WriterManager instance = new WriterManager();
    }

    public Writer getWriter(String writerName) {
        return map.get(writerName);
    }


    public void registerWriter(Writer writer) {
        map.put(writer.getName(), writer);
    }

}
