package com.cs.stru.designpattern.rpc.client;

import com.cs.stru.designpattern.rpc.registry.Server;
import com.cs.stru.designpattern.rpc.registry.ServerCenter;
import com.cs.stru.designpattern.rpc.service.HelloService;
import com.cs.stru.designpattern.rpc.service.HelloServiceImpl;

/**
 * @author benjaminChan
 * @date 2018/8/27 0027 上午 10:10
 * <p>
 * RPC(remote procedure call) 远程过程调用
 * RPC的实现方法：Java实现RPC
 */
public class RpcServerTest {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Server server = new ServerCenter(8088);
                server.register(HelloService.class, HelloServiceImpl.class);
                server.start();
            }
        }).start();
    }
}