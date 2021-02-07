package com.imust.crm.createthread.interrupt;

/**
 * 中断线程
 * 该方法仅仅是在当前线程打一个停止标志，并不是真正的停止线程
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 1000000000; i++) {
            // 判断线程的中断标志，isInterrupted()方法，该方法返回线程的中断标志
            if(this.isInterrupted()) {
                System.out.println("当前线程的中断标志为true");
//                break;
                return;
            }
            System.out.println("sub thread --> " + i);
        }
    }
}
