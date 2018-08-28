package com.cs.stru.designpattern.rpc.service;

/**
 * @author benjaminChan
 * @date 2018/8/28 0028 上午 11:04
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello," + name;
    }
}
