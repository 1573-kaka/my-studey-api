package com.imust.crm.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class FileTest {

    //private static Logger logger = LoggerFactory.getLogger(FileTest.class);

    @Test
    public void test() {
        /**
         * 1. File类的一个对象，代表一个文件或文件目录
         * 2. File类的声明在java.io下
         * 3. File类中涉及到关于文件或文件目录的创建、删除、重命名、修改时间、文件大小等方法，
         *    并未涉及到写入或读取文件内容的操作，如果要实现写入和读取文件内容，必须使用io流完成。
         * 4. 后续File类的对象常会作为参数传递到类的构造器中，指明读取或写入的终点。
         */
        File file = new File("D:/Work/JavaWorkSpace/work/1.txt");
        System.out.println("file = " + file);
        System.out.println("path = " + file.getPath());
        System.out.println("parent = " + file.getParent());
        System.out.println("absolutePath = " + file.getAbsolutePath());
        System.out.println("name = " + file.getName());
    }

    @Test
    public void fileReaderTest() {
        FileReader fr = null;
        try {
            File file = new File("D:/Work/JavaWorkSpace/work/1.txt");

            fr = new FileReader(file);
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print("data = " + data);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            /*try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }*/
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void readerTest() throws IOException {
        File file = new File("D:/Work/JavaWorkSpace/work/1.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        int len;
        char [] cbuf = new char[1024];
        while ((len = fr.read(cbuf)) != -1) {
            /*for (int i = 0; i < len; i++) {
                // 方式一：
                System.out.println(cbuf[i]);

            }*/

            //方式二：
            String str = new String(cbuf, 0, len);
            System.out.println(str);
            System.out.println(str.getClass());
        }

        fr.close();
    }

    @Test
    public void fileWriterTest() throws IOException {
        File file = new File("D:/Work/JavaWorkSpace/work/1.txt");

        FileWriter fw = new FileWriter(file, true);

        fw.write("hello world");

        fw.close();
    }

    @Test
    public void fileWriterToReaderTest() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File exFile = new File("D:/Work/JavaWorkSpace/work/1.txt");
            File dexFile = new File("D:/Work/JavaWorkSpace/work/2.txt");

            fr = new FileReader(exFile);
            fw = new FileWriter(dexFile);

            int len;
            char [] cbuf = new char[1024];
            while ((len = fr.read(cbuf)) != -1) {
                fw.write(cbuf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
