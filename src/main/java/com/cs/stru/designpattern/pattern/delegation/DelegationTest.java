package com.cs.stru.designpattern.pattern.delegation;

/**
 * @Date 2019/8/7 10:51
 * @Created by chending
 *
 * 委托模式：两个对象处理同一个请求，将请求委托给另外一个对象处理
 * 使用聚合来替代继承，而不是盲目使用继承，比如JDK中的Stack就是盲目继承Vector
 *
 * 两个对象处理了同一个请求，接收请求的对象将请求委托给另外一个对象，实际生活中就是Boss->TeamLeader->WorkA
 * Boss->Worker(找人干活)
 *
 * 不关心过程，只关心结果
 * Delegation
 *
 * 经典应用：DispatcherServlet
 */
public class DelegationTest {

    public static void main(String[] args) {
        //boss找TL干活，然后TL转交给了Tom
        Worker worker = new TeamLeader(new WorkerA());
        worker.doWork();
    }
}
