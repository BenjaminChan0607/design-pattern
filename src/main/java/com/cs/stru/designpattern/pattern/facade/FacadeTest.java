package com.cs.stru.designpattern.pattern.facade;

/**
 * @Date 2019/8/7 11:05
 * @Created by chending
 *
 * 它为子系统中的一组接口提供一个统一的高层接口。这一接口使得子系统更加容易使用。
 *
 * 门面模式：为子系统的一个或者一组接口提供了一个高层接口
 * 优点：客户端和子系统之间松耦合，客户端不必关心子系统，只需要通过聚合接口访问子系统
 * 缺点：当修改子系统的时候，需要修改外观类(createOrder/queryReport) -> (createOrder/notifyPay/queryReport)
 */
public class FacadeTest {
    public static void main(String[] args) {
        //优点，封装了子系统的具体操作，降低了client对子系统的耦合
        FacadeSystem facadeSystem = new FacadeSystem();
//        facadeSystem.operator();

        //缺点，当子系统增加操作时，需要修改外观类，如增加一个SubSystemC的操作
        facadeSystem.operator();

    }
}
