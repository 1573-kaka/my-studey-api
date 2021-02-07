package com.imust.crm.createthread;

public class ThroughTest {
    public static void main(String[] args) throws InterruptedException {
        ThroughThread thread = new ThroughThread();
        thread.setName("Thread");
        thread.start();

        Thread.sleep(500);

        Thread th = new Thread(thread);
        th.start();
    }
}
