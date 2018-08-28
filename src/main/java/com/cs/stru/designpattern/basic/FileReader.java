package com.cs.stru.designpattern.basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class FileReader implements Reader {

    private int a, b;

    public FileReader(String filePath) throws IOException {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new java.io.FileReader(file));
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
