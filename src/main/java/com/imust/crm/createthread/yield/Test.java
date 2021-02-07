package com.imust.crm.createthread.yield;

public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        long begin = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("main_用时：" + (end-begin));
    }
}
