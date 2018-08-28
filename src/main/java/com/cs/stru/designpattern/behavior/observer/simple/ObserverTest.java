package com.cs.stru.designpattern.behavior.observer.simple;

/**
 * Created by benjaminChan on 2018/7/12 0012 下午 7:32.
 */
public class ObserverTest {

    /**
     * 定义：观察者模式（有时又被称为发布-订阅模式、模型-视图模式、源-收听者模式或从属者模式）是软件设计模式的一种。
     * 在此种模式中，一个目标物件管理所有相依于它的观察者物件，并且在它本身的状态改变时主动发出通知。这通常透过呼叫各观察者所提供的方法来实现。此种模式完成事件处理系统
     * <p>
     * 上传文件到服务器，显示上传进度，使用观察者模式
     * <p>
     * 观察者模式的应用，读者和作者
     *
     * @param args
     */
    public static void main(String[] args) {
        Observable observable = new Observable();
        observable.addObserver(new ConcreteObserver1());
        observable.addObserver(new ConcreteObserver2());
        observable.change();
    }
}
