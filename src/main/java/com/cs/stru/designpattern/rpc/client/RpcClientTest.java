package com.cs.stru.designpattern.rpc.client;

import com.cs.stru.designpattern.rpc.service.HelloService;

import java.net.InetSocketAddress;

/**
 * @author benjaminChan
 * @date 2018/8/27 0027 上午 10:10
 * <p>
 * RPC(remote procedure call)
 * RPC的实现方法：Java实现RPC
 * <p>
 * RPC传输的数据以二进制序列的形式在多个进程之间传输。发送方将Java对象转换为字节序列，才能在网络上传送；接收方将字节序列转换成Java对象
 */
public class RpcClientTest {

    public static void main(String[] args) {
        HelloService helloService = RPCClient.getRemoteProxyObject(HelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(helloService.sayHello("tom"));
    }
}