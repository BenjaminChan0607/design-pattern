package com.cs.stru.designpattern.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DenpendentReader {

    private int a, b;

    public BufferedReader br;
    public String filePath;

    public void setBr() throws FileNotFoundException {
        this.br = new BufferedReader(new FileReader(filePath));
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void readFile() throws IOException {
        a = Integer.valueOf(br.readLine());
        b = Integer.valueOf(br.readLine());
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) throws IOException {
        DenpendentReader dr = new DenpendentReader();
        dr.setFilePath("c:/test.txt");
        dr.setBr();
        dr.readFile();
        dr.getA();
        dr.getB();
    }
}
