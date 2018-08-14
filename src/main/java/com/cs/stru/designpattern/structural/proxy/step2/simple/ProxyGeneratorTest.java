package com.cs.stru.designpattern.structural.proxy.step2.simple;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author benjaminChan
 * @date 2018/8/10 0010 下午 4:56
 */
public class ProxyGeneratorTest {

    public static void main(String[] args) throws IOException {
        byte[] classFile = ProxyGenerator.generateProxyClass("TestProxy", new Class[]{TestInterface.class});
        File file = new File("c:/TestProxy.class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(classFile);
        fos.flush();
        fos.close();
    }
}
