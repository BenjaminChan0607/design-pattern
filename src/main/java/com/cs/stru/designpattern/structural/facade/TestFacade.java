package com.cs.stru.designpattern.structural.facade;

/**
 * Created by benjaminChan on 2018/7/9 0009 下午 8:07.
 */
public class TestFacade {

    /**
     * 定义：外观模式是软件工程中常用的一种软件设计模式。它为子系统中的一组接口提供一个统一的高层接口。这一接口使得子系统更加容易使用。
     * <p>
     * 为子系统的一组接口提供一个统一的高层接口
     * <p>
     * 外观模式是为了解决类之间的耦合过度；
     * <p>
     * 相对比观察者，适配器小规模使用的设计模式
     * 外观模式是大范围的设计模式，我们的service层也可以看成是外观模式
     *
     * @param args
     */
    public static void main(String[] args) {
        Facade facade = new FacadeImpl();
        facade.functon12();
        facade.function23();
        facade.function123();

        System.out.println("---------------------------------------------");

        Sub1 sub1 = new Sub1Impl();
        Sub2 sub2 = new Sub2Impl();
        Sub3 sub3 = new Sub3Impl();
        sub1.function1();
        sub2.function2();

        sub2.function2();
        sub3.function3();

        sub1.function1();
        sub2.function2();
        sub3.function3();
    }
}
