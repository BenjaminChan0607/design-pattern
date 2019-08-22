package com.cs.stru.designpattern.pattern.facade;

/**
 * @Date 2019/8/7 11:17
 * @Created by chending
 */
public class FacadeSystem {
    public void operator() {
        SubSystemA subSystemA = new SubSystemA();
        SubSystemB subSystemB = new SubSystemB();

        subSystemA.operatorA();
        subSystemB.operatorB();

        //新加子系统时，需要修改外观类
        SubSystemC subSystemC = new SubSystemC();
        subSystemC.operatorC();
    }
}
