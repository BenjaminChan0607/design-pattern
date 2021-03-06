package com.cs.stru.designpattern.behavior.command.common;

public class BusinessMan {

    private String name;

    private ProductManager productManager;

    public BusinessMan(String name) {
        this.name = name;
    }

    public BusinessMan(String name, ProductManager productManager) {
        this.name = name;
        this.productManager = productManager;
    }

    public String getName() {
        return name;
    }

    public void provideDemand(ProductManager productManager) {
        System.out.println(getName() + " provide demand");
        productManager.receive(new Demand(productManager.assignProgramer()));
    }

    public void provideBug(ProductManager productManager) {
        System.out.println(getName() + " provide bug");
        productManager.receive(new Bug(productManager.assignProgramer()));
    }

    public void provideProblem(ProductManager productManager) {
        System.out.println(getName() + " provide problem");
        productManager.receive(new Problem(productManager.assignProgramer()));
    }
}
