package com.cs.stru.designpattern.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderClass {

    private int a, b;

    public ReaderClass(String filePath) throws IOException {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        a = Integer.valueOf(br.readLine());
        b = Integer.valueOf(br.readLine());
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
