package com.cs.stru.designpattern.behavior.command.common;

public class CommanTest {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Programmer programmer = new Programmer("Ben");
        productManager.addProgramer(programmer);

        BusinessMan businessManA = new BusinessMan("A");
        BusinessMan businessManB = new BusinessMan("B");
        BusinessMan businessManC = new BusinessMan("C");
        BusinessMan businessManD = new BusinessMan("D");

        businessManA.provideDemand(productManager);
        businessManB.provideBug(productManager);
        businessManC.provideProblem(productManager);
        businessManD.provideDemand(productManager);
        businessManD.provideBug(productManager);
        businessManD.provideProblem(productManager);

        System.out.println("first day.");
        productManager.assign();
        productManager.printTaskList();
        System.out.println("second day.");
        productManager.assign();
        productManager.printTaskList();
    }
}
