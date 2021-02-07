package com.imust.crm.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("aaa");
        vector.add("bbb");
        vector.add("ccc");
        System.out.println(vector.size());
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }

        System.out.println(vector.contains("aaa"));
    }
}
