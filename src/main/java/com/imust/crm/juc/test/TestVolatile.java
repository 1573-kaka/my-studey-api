package com.imust.crm.juc.test;

import org.junit.Test;

public class TestVolatile {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        new Thread(thread).start();

        while (true) {
            if(thread.getFlag()) {
                System.out.println("######");
                break;
            }
        }
    }

    @Test
    public void test1() {
        MyThread thread = new MyThread();
        new Thread(thread).start();

        while (true) {
            synchronized (thread) {
                if (thread.getFlag()) {
                    System.out.println("######");
                    break;
                }
            }
        }
    }

    @Test
    public void test2() {
        MyThread thread = new MyThread();
        new Thread(thread).start();
    }
}
