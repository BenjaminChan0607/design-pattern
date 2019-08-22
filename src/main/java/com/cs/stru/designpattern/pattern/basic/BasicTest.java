package com.cs.stru.designpattern.pattern.basic;

/**
 * @Date 2019/8/7 11:27
 * @Created by chending
 * <p>
 * <p>
 * 高内聚，低耦合
 *
 * 单一责任原则
 * 开闭原则
 * 依赖倒置原则
 *
 *只有遵从这些规则，其实已经使用了这些原则，可能你也知道是按照一定的约定，但是没有形成理论体系而已
 *
 * 为啥使用设计模式以及设计原则，提升系统的可维护性和可扩展性
 *
 *
 */
public class BasicTest {
    public static void main(String[] args) {
        Object a = "test";
        Object b = 1;
        System.out.println(a.equals(b));

    }
}
