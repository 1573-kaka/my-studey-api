package com.imust.crm.createthread.daemon;

import lombok.SneakyThrows;

/**
 * Java中的线程分为用户线程和守护线程
 * 1.守护线程是为其他线程提供服务的线程，如垃圾回收器(GC)，就是一个典型的守护线程
 * 2.守护线程是不能单独运行，当JVM中没有其他用户线程，只有守护线程时，守护线程会自动销毁，JVM会退出
 */
public class MyThread extends Thread{
    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            System.out.println("sub thread...");
            Thread.sleep(1000);
        }
    }
}
