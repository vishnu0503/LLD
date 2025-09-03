package com.singleton;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonDemo {
    public static void main(String[] args) {

        // Singleton demo for single threaded environment
        Singleton singletonDemo =  Singleton.getInstance();

        System.out.print(singletonDemo.getInstance().hashCode());

        // Singleton demo for multi-threaded environment
        ExecutorService executor = Executors.newFixedThreadPool(5);

        Runnable task = () -> {
            try {
                Thread.sleep(3000); // Delay, since mentioned 5 as max pool size only 5 threads run concurrently
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            Singleton singleton = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " received instance: " + singleton.hashCode());
        };

        // Submit multiple tasks
        for (int i = 0; i < 10; i++) {
            executor.submit(task);
        }

        executor.shutdown();
    }
}
