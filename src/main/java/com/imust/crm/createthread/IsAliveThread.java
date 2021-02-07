package com.imust.crm.createthread;

public class IsAliveThread extends Thread{
    @Override
    public void run() {
        System.out.println("this.isAlive() = " + this.isAlive());
    }
}
