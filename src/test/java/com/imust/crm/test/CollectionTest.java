package com.imust.crm.test;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CollectionTest {
    @Test
    public void collectionTest() {
        String[] str = {"AA", "BB", "CC"};

        List<String> list = Arrays.asList(str);

        System.out.println("list = " + list);

        List arr = Arrays.asList(1,2,3);
        System.out.println("arr = " + arr);
    }

}
