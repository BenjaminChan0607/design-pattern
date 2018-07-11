package com.cs.stru.designpattern.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class Calculator {

    public int add() throws IOException {
        File file = new File("c:/test.txt");
        BufferedReader br = new BufferedReader(new java.io.FileReader(file));
        int a = Integer.valueOf(br.readLine());
        int b = Integer.valueOf(br.readLine());
        return a + b;
    }

    /**
     * 单一职责原则
     *
     * @return
     * @throws IOException
     */
    public int add2() throws IOException {
        ReaderClass readerClass = new ReaderClass("c/test.txt");
        return readerClass.getA() + readerClass.getB();
    }

    /**
     * 依赖倒置原则
     *
     * @return
     * @throws IOException
     */
    public int add3() throws IOException {
        Reader reader = new FileReader("c:/test.txt");
        return reader.getA() + reader.getB();
    }

    public static void main(String[] args) throws IOException {
        new Calculator().add();
        new Calculator().add2();
    }
}
