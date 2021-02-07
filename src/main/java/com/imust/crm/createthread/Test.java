package com.imust.crm.createthread;

public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();   //开启子线程

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("main : " + i);
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
