package com.cs.stru.designpattern.behavior.templatemethod;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by benjaminChan on 2018/7/16 0016 下午 7:24.
 */
public class MyClassLoader extends ClassLoader {

    public Class<?> loadClass(String name) throws ClassNotFoundException {
        String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
        InputStream is = getClass().getResourceAsStream(fileName);
        if (is == null) {
            return super.loadClass(name);
        }
        try {
            byte[] b = new byte[is.available()];
            is.read(b);
            return defineClass(name, b, 0, b.length);
        } catch (IOException e) {
            throw new ClassNotFoundException();
        }
    }
}
