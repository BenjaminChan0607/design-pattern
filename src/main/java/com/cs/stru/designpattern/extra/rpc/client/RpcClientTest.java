package com.cs.stru.designpattern.extra.rpc.client;

import com.cs.stru.designpattern.extra.rpc.service.HelloService;

import java.net.InetSocketAddress;

/**
 * @author benjaminChan
 * @date 2018/8/27 0027 上午 10:10
 * <p>
 * RPC(remote procedure call)
 * RPC的实现方法：Java实现RPC
 * <p>
 * RPC传输的数据以二进制序列的形式在多个进程之间传输。发送方将Java对象转换为字节序列，才能在网络上传送；接收方将字节序列转换成Java对象
 * <p>
 * RPC通信方式采用的Socket是基于BIO实现的，IO效率不高，还有Java原生的序列化机制占内存太多，运行效率也不高。可以考虑从下面几种方法改进。
 * 可以采用基于JSON数据传输的RPC框架；
 * 可以使用NIO或直接使用Netty替代BIO实现；
 * 使用开源的序列化机制，如Hadoop Avro与Google protobuf等；
 * 服务注册可以使用Zookeeper进行管理，能够让应用更加稳定。
 */
public class RpcClientTest {

    public static void main(String[] args) {
        HelloService helloService = RPCClient.getRemoteProxyObject(HelloService.class, new InetSocketAddress("localhost", 8088));
        System.out.println(helloService.sayHello("tom"));
    }
}