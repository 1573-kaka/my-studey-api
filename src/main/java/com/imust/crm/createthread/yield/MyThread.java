package com.imust.crm.createthread.yield;

/**
 * Thread.yield()方法的作用是放弃当前的CPU资源
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
            // 线程让步，放弃CPU执行权
            Thread.yield();
        }
        long end = System.currentTimeMillis();
        System.out.println("my_用时：" + (end-begin));
    }
}
