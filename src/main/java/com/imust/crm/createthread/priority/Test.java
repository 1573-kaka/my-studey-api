package com.imust.crm.createthread.priority;

public class Test {
    public static void main(String[] args) {
        MyThread_01 t1 = new MyThread_01();
        t1.setPriority(1);
        t1.start();

        MyThread_02 t2 = new MyThread_02();
        t2.setPriority(10);
        t2.start();
    }
}
