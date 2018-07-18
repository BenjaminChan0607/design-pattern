package com.cs.stru.designpattern.behavior.command;

public class CommandTest {

    public static void main(String[] args) {
        Programmer ben = new Programmer("Ben");

        BusinessMan tom = new BusinessMan("Tom");
        tom.provideDemand(ben);

        BusinessMan jerry = new BusinessMan("Jerry");
        jerry.provideBug(ben);

        BusinessMan thomas = new BusinessMan("Thomas");
        thomas.provideProblem(ben);

        BusinessMan fiona = new BusinessMan("Fiona");
        fiona.provideDemand(ben);
    }
}
