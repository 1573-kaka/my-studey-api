package com.imust.crm.test;

import org.junit.Test;

import java.io.*;

public class BufferedTest {
    @Test
    public void test() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File exFile = new File("D:/Work/JavaWorkSpace/work/pxbf.mp3");
            File dexFile = new File("D:/Work/JavaWorkSpace/work/cp_pxbf.mp3");

            fis = new FileInputStream(exFile);
            fos = new FileOutputStream(dexFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buf = new byte[1024];
            int len;

            while ((len = bis.read(buf)) != -1) {
                bos.write(buf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
