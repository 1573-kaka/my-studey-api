package com.imust.crm.createthread.daemon;

public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        // 设置守护线程的代码应该放到启动线程前面
        thread.setDaemon(true);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main --> " + i);
        }
    }
}
