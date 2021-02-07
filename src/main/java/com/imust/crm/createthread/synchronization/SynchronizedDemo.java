package com.imust.crm.createthread.synchronization;

public class SynchronizedDemo implements Runnable{

    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SynchronizedDemo demo = new SynchronizedDemo();
            Thread thread = new Thread(demo);
            thread.start();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("result: " + count);
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            count++;
        }
    }
}
