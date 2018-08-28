package com.cs.stru.designpattern.rpc.registry;

/**
 * @author benjaminChan
 * @date 2018/8/28 0028 上午 11:04
 */
public interface Server {

    void start();

    void stop();

    boolean running();

    int getPort();

    void register(Class clazz, Class clazzImpl);
}
