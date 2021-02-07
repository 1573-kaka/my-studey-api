package com.imust.crm.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet集合的使用
 * Comparator:实现定制比较(比较器)
 */
public class Demo {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int age = o1.getAge() - o2.getAge();
                int name = o1.getName().compareToIgnoreCase(o2.getName());
                return age == 0 ? name : age;
            }
        });
    }

    @Test
    public void test() {
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int length = o1.length() - o2.length();
                int value = o1.compareToIgnoreCase(o2);
                return length == 0 ? value : length;
            }
        });

        set.add("hello");
        set.add("world");
        set.add("nihao");
        set.add("xioaming");
        set.add("dengdeng");
        set.add("ziqi");

        System.out.println(set.toString());

        /*Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (String s : set) {
            System.out.println(s);
        }*/
    }
}
