package com.cs.stru.designpattern.behavior.observer.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by benjaminChan on 2018/7/12 0012 下午 8:22.
 */
public class Platform {

    private Map<String, Writer> map = new HashMap<String, Writer>();
    private static Platform platform = new Platform();

    private Platform() {
    }

    public static Platform getInstance() {
        return platform;
    }

    public void publish(Writer writer) {
        map.put(writer.getName(), writer);
    }

    public Writer getWriter(String name) {
        return map.get(name);
    }
}
