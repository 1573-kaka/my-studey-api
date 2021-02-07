package com.imust.crm.test;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    @Test
    public void test() throws IOException {
        File file = new File("D:/Work/JavaWorkSpace/work/1.txt");
        FileInputStream fis = new FileInputStream(file);

        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

    }
}
