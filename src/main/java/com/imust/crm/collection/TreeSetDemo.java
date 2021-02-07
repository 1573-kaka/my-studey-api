package com.imust.crm.collection;

import java.util.TreeSet;

/**
 * 存储结构：红黑树
 * 1.基于排列顺序实现元素不重复
 * 2.实现了SortedSet接口，对集合元素自动排序
 * 3.元素对象类必须实现Comparable接口，指定排序规则
 * 4.通过CompareTo方法确定是否为重复元素
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet();
        Person p1 = new Person("子鼠", 21);
        Person p2 = new Person("丑牛", 22);
        Person p3 = new Person("寅虎", 23);
        Person p4 = new Person("卯兔", 21);
        Person p5 = new Person("辰龙", 25);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        System.out.println(set.toString());
    }
}
