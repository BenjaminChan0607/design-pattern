package com.cs.stru.designpattern.structural.chargeadapter;

public class TestAdapter {

    public static void main(String[] args) {
        Usb huaWeiUsb = new HuaWeiMobile();
        huaWeiUsb.charge();

//        Usb xiaoMi = new XiaoMiMobile();
//        xiaoMi.charge();

        Usb typeCAdapter = new TypeCAdapter();
        typeCAdapter.charge();

//        MiMobile miMobile = new MiMobile();
//        miMobile.typeCChare();
    }
}
