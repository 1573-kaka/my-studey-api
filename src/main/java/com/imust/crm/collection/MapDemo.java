package com.imust.crm.collection;

import java.util.*;

/**
 * Map接口的使用
 * 特点:(1)存储键值对 (2)键不可以重复,值可以重复 (3)无序
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("cn", "中国");
        map.put("uk", "英国");
        map.put("usa", "美国");
        System.out.println("map.size() = " + map.size());
        System.out.println("map.toString() = " + map.toString());

//        map.remove("usa");
//        System.out.println("元素个数" + map.size());

        /*Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }*/

        Set<Map.Entry<String, String>> entries = map.entrySet();
//        Iterator<Map.Entry<String, String>> it = entries.iterator();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
