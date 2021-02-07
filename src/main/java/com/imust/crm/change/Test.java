package com.imust.crm.change;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        int age = 40;
        Person tom = new Person(1, 20, "海定");
        Person jack = new Person(2, 30, "朝阳");
        test.change1(age);
        System.out.println("age = " + age);
        test.change2(tom);
        System.out.println("tom = " + tom);
        test.change3(jack);
        System.out.println("jack = " + jack);


    }

    public void change1(int i) {
        i = 3366;
    }

    public void change2(Person p) {
        p = new Person(3, 22, "西域");
    }

    public void change3(Person p) {

    }
}
