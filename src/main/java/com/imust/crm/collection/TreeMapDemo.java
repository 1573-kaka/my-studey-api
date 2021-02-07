package com.imust.crm.collection;

import java.util.TreeMap;

/**
 *
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Person, String> map = new TreeMap<>();

        Person p1 = new Person("子鼠", 21);
        Person p2 = new Person("丑牛", 22);
        Person p3 = new Person("寅虎", 23);
        Person p4 = new Person("卯兔", 21);
        Person p5 = new Person("辰龙", 25);

        map.put(p1, "北京");
        map.put(p2, "上海");
        map.put(p3, "天津");
        map.put(p4, "南京");
        map.put(p5, "深圳");

        System.out.println(map.toString());
    }
}
