package com.imust.crm.collection;

import java.util.HashMap;

/**
 * 存储结构:哈希表(数组+链表+红黑树)
 * JDK1.2版本,线程不安全,运行效率快;允许用null作为key或者value
 * 默认初始容量为16,默认加载加载因子为0.75....容量为16*0.75时,扩容-->扩容为原来的2倍
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("", "");
    }
}
