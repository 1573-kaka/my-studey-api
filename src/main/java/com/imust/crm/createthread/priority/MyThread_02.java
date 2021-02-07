package com.imust.crm.createthread.priority;

/**
 * thread.setPriority(num);设置线程的优先级
 * java线程的优先级取值范围是1-10，如果超出这个范围会抛出异常illegalArgumentException。
 * 在操作系统中，优先级较高的线程获得CPU的资源越多
 * 线程的优先级本质上只是给线程调度器一个提示信息，以便于调度器决定先调度哪些线程，注意不能保证优先级高的线程先运行
 * java优先级设置不当或者滥用可能会导致某些线程永远无法得到运行，即产生了线程饥饿
 * 线程的优先级并不是设置的越高越好，一般情况下使用普通优先级即可，即在开发是不必设置现在的优先级
 */
public class MyThread_02 extends Thread{
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 1000000000; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("用时_02：" + (end - begin));
    }
}
