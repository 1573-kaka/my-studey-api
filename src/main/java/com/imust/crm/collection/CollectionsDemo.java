package com.imust.crm.collection;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(88);
        list.add(34);
        list.add(73);
        list.add(55);
        list.add(18);
        list.add(22);

        System.out.println("list = " + list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println("list = " + list);

        int value = Collections.binarySearch(list, 22);
        System.out.println("value = " + value);

       /* List<Integer> dest = new ArrayList<>();
        Collections.copy(dest, list);*/

        Collections.reverse(list);
        System.out.println("list = " + list);

        Collections.shuffle(list);
        System.out.println("list = " + list);

        Object[] array = list.toArray();
        for (Object i : array) {
            System.out.println(i);
        }

        List<Object> asList = Arrays.asList(array);

    }
}
