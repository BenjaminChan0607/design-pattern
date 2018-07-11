package com.cs.stru.designpattern.structural.decorator;

import java.io.*;

/**
 * Created by benjaminChan on 2018/7/10 0010 下午 7:52.
 */
public class TestDecorator {

    /**
     * 定义：装饰模式是在不必改变原类文件和使用继承的情况下，动态的扩展一个对象的功能。它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
     * <p>
     * 装饰来包裹真实的对象，经典应用IO流
     * <p>
     * 采用动态扩展，采用组合的方式取代继承
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
//        test();
        testIO();
    }

    /**
     * 装饰器模式能够动态扩展类功能，它采用组合的方式取代继承，使得各个功能的扩展更加独立和灵活
     * @throws IOException
     */
    private static void testIO() throws IOException {
        String filePath = "D:/workspace/extraProject/design-pattern/src/main/java/com/cs/stru/designpattern/structural/decorator/test.txt";
        InputStream inputStream = new FileInputStream(filePath);
        int len = inputStream.available();//an estimate of the number of bytes that can be read
        System.out.println("InputStream  len:" + len + "," + inputStream.markSupported());

        System.out.println("--------------------------------------------------------------");

        //BufferedInputStream,DataInputStream,PushbackInputStream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        System.out.println("" + bufferedInputStream.markSupported());
        bufferedInputStream.mark(0);
        char firstChar = (char) bufferedInputStream.read();
        System.out.println("firstChar:" + firstChar);
        bufferedInputStream.reset();
        char anotherChar = (char) bufferedInputStream.read();
        System.out.println("anotherChar:" + anotherChar);
        bufferedInputStream.reset();

        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        int value = dataInputStream.readInt();
        String binary = Integer.toBinaryString(value);
        System.out.println(value + "," + binary);

        int firstLen = binary.length() % 8;
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                System.out.println("firstChar:" + Integer.valueOf(binary.substring(0, firstLen), 2));
            } else {
                System.out.println((i + 1) + ",char:" + Integer.valueOf(binary.substring((i - 1) * 8 + firstLen, i * 8 + firstLen), 2));
            }
        }

        inputStream = new FileInputStream(filePath);
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, len);
        System.out.println("pushbackInputStream:" + pushbackInputStream.available());
        byte[] bytes = new byte[len];
        pushbackInputStream.read(bytes);
        System.out.println(new String(bytes) + "," + pushbackInputStream.available());
        pushbackInputStream.unread(bytes);
        System.out.println(new String(bytes) + "," + pushbackInputStream.available());

        inputStream = new FileInputStream(filePath);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println(bufferedReader.readLine());

        LineNumberReader lineNumberReader = new LineNumberReader(inputStreamReader);
        System.out.println(lineNumberReader.getLineNumber());
    }

    private static void test() {
        Component component = new ConcreteDecorator();
        component.method();

        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
        concreteDecoratorA.method();
        concreteDecoratorA.methodA();

        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB(component);
        concreteDecoratorB.method();
        concreteDecoratorB.methodB();

        concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);
        concreteDecoratorB.method();
        concreteDecoratorB.methodB();
    }
}
