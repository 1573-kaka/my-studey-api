package com.imust.crm.collection;

import java.util.HashSet;

/**
 * 存储结构：哈希表（数组+链表+红黑树）
 * 存储过程：
 * (1)通过hashcode计算保存的位置，如果此位置为空，则直接保存，如果不为空，执行第二步
 * (2)再执行equals方法，如果equals方法为true，则认为是重复，否则形成列表
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();

        Person p1 = new Person("张三", 21);
        Person p2 = new Person("李四", 22);
        Person p3 = new Person("王五", 23);
        Person p4 = new Person("张三", 21);

        set.add(new Person("张三", 21));

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println("元素个数：" + set.size());
        System.out.println(set.toString());
    }
}
