package com.cs.stru.designpattern.creational.singleinstance;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleton {

    public static void main(String[] args) throws InterruptedException {
        final Set<String> setInstance = Collections.synchronizedSet(new HashSet<String>());
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10000; i++) {
            executorService.execute(new Runnable() {
                public void run() {
                    Singleton singleton = Singleton.getSingleton();
                    setInstance.add(singleton.toString());
                }
            });
        }

        Thread.sleep(5000);
        System.out.println(setInstance.size());
        for (String str : setInstance) {
            System.out.println(str);
        }
        executorService.shutdown();
    }

}
