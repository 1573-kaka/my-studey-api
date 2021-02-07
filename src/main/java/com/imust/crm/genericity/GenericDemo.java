package com.imust.crm.genericity;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class GenericDemo {
    @Test
    public void test() {
        Generic<Integer> generic = new Generic();
    }

    @Test
    public void demo() {
        SubGeneric<Integer> subGeneric = new SubGeneric();
        subGeneric.setGenericT(11111);
    }

    @Test
    public void function() {
        SubGeneric subGeneric = new SubGeneric();
        Integer [] arr = new Integer[]{1, 2, 3, 4, 5};
        List list = subGeneric.copyFromArrayToList(arr);

        System.out.println("list = " + list);
    }

    @Test
    public void print(List<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.print(next + " ");
        }
    }
}
