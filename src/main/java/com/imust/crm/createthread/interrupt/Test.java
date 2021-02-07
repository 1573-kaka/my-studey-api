package com.imust.crm.createthread.interrupt;

public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main = " + i);
        }

        // 中断子线程
        // 仅仅是给子线程标记中断，子线程没有真正的中断
        thread.interrupt();
    }
}
