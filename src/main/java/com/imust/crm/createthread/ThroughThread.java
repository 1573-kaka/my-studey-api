package com.imust.crm.createthread;

public class ThroughThread extends Thread{
    public ThroughThread() {
        System.out.println("构造方法中，Thread.currentThread().getName() --> " + Thread.currentThread().getName());
        System.out.println("构造方法中，this.getName() --> " + this.getName());
    }

    @Override
    public void run() {
        System.out.println("run方法中，Thread.currentThread().getName() --> " + Thread.currentThread().getName());
        System.out.println("run方法中，this.getName() --> " + this.getName());
    }
}
