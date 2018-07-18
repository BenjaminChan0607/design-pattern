package com.cs.stru.designpattern.behavior.command.common;

public class CommanTest {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Programmer programmer = new Programmer("Ben");

        BusinessMan businessManA = new BusinessMan("A");
        BusinessMan businessManB = new BusinessMan("B");
        BusinessMan businessManC = new BusinessMan("C");
        BusinessMan businessManD = new BusinessMan("D");

        businessManA.provideDemand(productManager,programmer);
        businessManB.provideBug(productManager,programmer);
        businessManC.provideProblem(productManager,programmer);
        businessManD.provideDemand(productManager,programmer);
        businessManD.provideBug(productManager,programmer);
        businessManD.provideProblem(productManager,programmer);

        System.out.println("first day.");
        productManager.assign();
        productManager.printTaskList();
        System.out.println("second day.");
        productManager.assign();
        productManager.printTaskList();
    }
}
