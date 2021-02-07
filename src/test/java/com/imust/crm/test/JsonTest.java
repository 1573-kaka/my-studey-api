package com.imust.crm.test;

import com.google.gson.Gson;
import org.junit.Test;

public class JsonTest {
    @Test
    public void test() {

        Gson gson = new Gson();

        // 基本数据类型的解析
        int i = gson.fromJson("1000", int.class);
        double d = gson.fromJson("\"99.99\"", double.class);
        boolean b = gson.fromJson("true", boolean.class);
        String string = gson.fromJson("String", String.class);

        // 基本数据类型的生成
        String jsonNumber = gson.toJson(100);
        String jsonBoolean = gson.toJson(false);
        String jsonString = gson.toJson("String");
    }

}
