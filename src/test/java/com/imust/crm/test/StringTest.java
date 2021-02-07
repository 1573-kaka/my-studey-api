package com.imust.crm.test;

import org.junit.Test;

public class StringTest {
    @Test
    public void test(){
        String str1 = "hello world";
        System.out.println("str1 = " + str1);
        String str2 = new String("hello").intern(); //手工入池
        System.out.println("str2 = " + str2);
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars);
        System.out.println("str3 = " + str3);
    }

    @Test
    public void functionTest() {
        String message = "www.yaolantu.com";
        System.out.println("message = " + message);
        System.out.println(message.charAt(6));
//        System.out.println(message.charAt(99));
        char[] chars = message.toCharArray();
        for (char aChar : chars) {
            System.out.print(aChar);
        }
        System.out.println();
        String upperCase = message.toUpperCase();
        System.out.println("upperCase = " + upperCase);
    }

    @Test
    public void byteTest() {
        String message = "www.yaolantu.com";
        byte[] bytes = message.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print((char) bytes[i]);
        }
    }

    @Test
    public void function() {
        String message = "www.yaolantu.com";
        System.out.println(message.contains("eee"));

        System.out.println(message.indexOf('y'));
        System.out.println(message.lastIndexOf("yo"));

        if (message.startsWith("www")) {
            System.out.println(222);
        }

        if (message.endsWith("com")) {
            System.out.println(111);
        }
    }

    @Test
    public void demo() {
        String message = "www.yaolantu.com";
        System.out.println("message = " + message.replaceAll("www", "http://www"));
        System.out.println("message = " + message.replaceFirst("www", "http://www"));

        String[] splits = message.split("\\.", 3);
        for (String split : splits) {
            System.out.println(split);
        }

        String replace = message.replace('.', ' ');
        System.out.println("message = " + replace);

        System.out.println(message.substring(message.indexOf('.') + 1,message.lastIndexOf('.')));
    }

    @Test
    public void stringBufferTest() {
        String message = "www.yaolantu.com";

        StringBuffer stringBuffer = new StringBuffer(message);
        StringBuilder stringBuilder = new StringBuilder();
    }

    @Test
    public void regexTest() {
        String str = "31783467591028516";
        System.out.println(str.matches("\\d+"));
    }
}
