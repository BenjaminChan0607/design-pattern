package com.cs.stru.designpattern.extra.rpc.registry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author benjaminChan
 * @date 2018/8/28 0028 上午 11:07
 */
public class ServerCenter implements Server {

    private static final ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    private static final HashMap<String, Class> serviceRegistry = new HashMap<String, Class>();

    private boolean running = false;

    private int port;

    public ServerCenter() {
    }

    public ServerCenter(int port) {
        this.port = port;
    }

    @Override
    public void start() {
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(port));
            System.out.println("server start");
            try {
                while (true) {
                    // 1.监听客户端的TCP连接，接到TCP连接后将其封装成task，由线程池执行
                    es.execute(new ServerTask(serverSocket.accept()));
                }
            } finally {
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() {
        running = false;
        es.shutdown();
    }

    @Override
    public boolean running() {
        return running;
    }

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public void register(Class clazz, Class clazzImpl) {
        serviceRegistry.put(clazz.getName(), clazzImpl);
    }

    private class ServerTask implements Runnable {
        Socket client;

        public ServerTask(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {
            ObjectInputStream inputStream = null;
            ObjectOutputStream outputStream = null;
            try {
                // 2.将客户端发送的码流反序列化成对象，反射调用服务实现者，获取执行结果
                inputStream = new ObjectInputStream(client.getInputStream());
                String serviceName = inputStream.readUTF();
                String methodName = inputStream.readUTF();
                Class<?>[] parameterTypes = (Class<?>[]) inputStream.readObject();
                Object[] arguments = (Object[]) inputStream.readObject();
                Class serviceClass = serviceRegistry.get(serviceName);
                if (serviceClass == null) {
                    throw new ClassNotFoundException(serviceName + " not found");
                }
                Method method = serviceClass.getMethod(methodName, parameterTypes);
                Object result = method.invoke(serviceClass.newInstance(), arguments);

                // 3.将执行结果反序列化，通过socket发送给客户端
                outputStream = new ObjectOutputStream(client.getOutputStream());
                outputStream.writeObject(result);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
