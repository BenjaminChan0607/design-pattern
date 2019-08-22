package com.cs.stru.designpattern.pattern.decoration;

/**
 * @Date 2019/8/7 11:36
 * @Created by chending
 *
 * 来公司四个月，感觉没做啥，说的上的事情，就只是正常完成需求任务罢了
 *
 * 装饰模式：在不修改原类文件和使用继承的前提下，动态扩展一个类的功能，创建包装对象，来包裹真实的对象
 *
 *  * 单一责任原则
 *  * 开闭原则
 *  * 依赖倒置原则
 *
 *  策略模式，装饰模式，代理模式
 *  这三个模式都是在辅助类里持有一个目标类对象，通过操作目标类对象来完成实际任务
 *
 *  策略模式通过将一些易变的计算抽象为策略实体，通过多态，让实际调用者尽可能的不用感知这种变化。
 *  策略模式，不同的数据源采用不同的数据处理类来处理
 *  DataSourceHandler handler = dataSourceFactory.createStrategy(dataSource);
 *
 *
 *  代理模式与策略模式不同的是，代理类必须和被代理类具有相同的父类或接口，即代理类要么继承或实现被代理类的父类，要么直接继承被代理类本身。这两种情况分别对应java的jdk代理和cglib代理实现。
 *
 *  *  Context Strategy -- StrategyA/StrategyB
 *
 */
public class DecorationTest {

    public static void main(String[] args) {

    }

}
