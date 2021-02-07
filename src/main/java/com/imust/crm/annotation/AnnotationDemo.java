package com.imust.crm.annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 自定义注解:参照@SuppressWarnings
 *      1.注解申明为:@interface
 *      2.内部定义成员,通常使用value表示
 *      3.可以指定成员的默认值,使用default定义
 *      4.如果自定义注解没有成员,表明是一个标识作用
 * 自定义注解都会指明俩个元注解:Retention和Target
 *
 * 1.jdk提供的4种元注解
 *      元注解:对现有的注解进行解释说明的注解
 *  Retention:指定所修饰的Annotation的生命周期:SOURCE\CLASS(默认行为)\RUNTIME
 *      只有生命为RUNTIME生命周期的注解,才能通过反射获取.
 *  Target:用于指定被修饰的Annotation能用于修饰哪些程序元素
 *  Documented:表示所修饰的注解在被javadoc解析时,保留下来
 *  Inherited:被他修饰的Annotation具有继承性
 *
 *  通过反射获取注解信息
 *
 * 2.jdk 8中注解新特性:可重复注解、类型注解
 *   可重复注解：
 *   类型注解：
 */
public class AnnotationDemo {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int age = 10;
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Person {
    private String name;
    private Integer age;

    @Deprecated
    public void walk() {
        System.out.println("人走路");
    }

    public void eat() {
        System.out.println("人吃饭");
    }
}

interface info {
    void show();
}

class Student extends Person implements info {
    @Override
    public void walk() {
        System.out.println("学生走路");
    }

    @Override
    public void show() {

    }
}
