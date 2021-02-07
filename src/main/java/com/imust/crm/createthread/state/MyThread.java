package com.imust.crm.createthread.state;

/**
 * 线程的生命周期是线程对象的生老病死，即线程的状态
 * 线程的生命周期可以通过getState()方法获得，线程的状态是Thread.State枚举类型定义的，有以下几种：
 *      NEW：新建状态，创建了线程对象，在调用start()启动之前的状态
 *      RUNNABLE：可运行状态，它是一个复合状态，包括READY和RUNNING俩个状态，
 *          READY状态该线程可以继续被线程调度器进行调度使处于RUNNING状态
 *          RUNNING：表示该线程正在执行线程的run()方法
 *      Thread.yield：可以报线程由RUNNING状态转换为READY状态
 *      BLOCKED：阻塞状态，线程发起一个阻塞的I/O操作，或者申请由其他线程占用的独占资源，
 *          线程会转为阻塞状态，处于阻塞状态的线程，不会占用CPU资源。当阻塞I/O操作执行完，
 *          或者线程获得了其申请的资源，线程可以转换为RUNNABLE
 *      WAITING：等待状态。线程执行了object.wait()，Thread.join()方法会把线程转换为WAITING等待状态，
 *          执行object.notify()方法，或者加入的线程执行完毕，当前线程会转换为RUNNABLE状态
 *      TIME_WAITING：与WAITING类似，都是等待状态。区别在于处于该状态的线程不会无限制的等待，
 *          如果线程没有在指定的时间范围内完成期望的操作，该线程自动装换为RUNNABLE
 *      TERMINATED：终止状态，线程结束处于终止状态
 */
public class MyThread {
}
