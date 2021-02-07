package com.imust.crm.createthread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("sub thread : " + i);
            System.out.println(Thread.currentThread());
        }

    }
}
