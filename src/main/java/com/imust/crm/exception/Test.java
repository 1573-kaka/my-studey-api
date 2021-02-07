package com.imust.crm.exception;


public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.regist(-10);
    }
}

class Student {
    private Integer age;

    public void regist(Integer age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new RuntimeException("错啦，错啦，错啦。。。");
        }
    }
}
