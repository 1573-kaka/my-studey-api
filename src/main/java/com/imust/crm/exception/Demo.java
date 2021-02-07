package com.imust.crm.exception;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一、异常的体系结构
 * java.lang.Throwable
 *  |--java.lang.error:一般不编写针对性的代码进行处理
 *  |--java.lang.exception:可以进行异常处理
 *      |--编译时异常(checked)
 *          |--IOException
 *              |--FileNotFoundException
 *          |--ClassNotFoundException
 *      |--运行时异常(unchecked, RuntimeException)
 *          |--NullPointerException
 *          |--ArrayIndexOutBoundException
 *          |--ClassCaseException
 *          |--NumberFormatException
 *          |--InputMismatchException
 *          |--ArithmeticException
 *
 *
 * 方法重写的规则一：
 *  子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 * 开发中如何选择：
 *
 */
public class Demo {

    private static Logger logger = LoggerFactory.getLogger(Demo.class);

    @Test
    public void demo() {
        File file = null;
        FileInputStream fis = null;
        try {
            file = new File("D:/Work/JavaWorkSpace/work/io流/1.txt");
            //logger.info("找到了");
            fis = new FileInputStream(file);
        } catch (FileNotFoundException exception) {
            String message = exception.getMessage();
            System.out.println("message = " + message);
            exception.printStackTrace();

            //logger.error("没找着"+ file.getPath() +"文件");
        } catch (IOException exception) {
            String message = exception.getMessage();
            System.out.println("message = " + message);
            exception.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

