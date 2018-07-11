package com.cs.stru.designpattern.structural.chargeadapter;

@Deprecated
public class XiaoMiMobile implements Usb {
    public void charge() {
        throw new RuntimeException("xiaoMi doesn't support usb interface.");
    }
}
