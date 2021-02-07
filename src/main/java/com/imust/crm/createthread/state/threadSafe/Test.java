package com.imust.crm.createthread.state.threadSafe;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {
        MyInt myInt = new MyInt();

        for (int i = 0; i < 2; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        System.out.println(Thread.currentThread().getName() + " -> " + myInt.getNum());
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
    }

    static class MyInt {
        volatile int num;

        public int getNum() {
            return num++;
        }
    }

    // 在java中提供了一个线程安全的AtomicInteger类，保证了操作的原子性
    static class MyAtomicInteger {
        AtomicInteger num = new AtomicInteger();

        public int getNum() {
            return num.incrementAndGet();
        }
    }
}
