package com.imust.crm.enumeration;

/**
 * 一.枚举类的使用
 * 1.枚举类的理解:类的对象只有有限个,确定的.我们称为枚举类.
 * 2.当需要定义一组常量时,强烈建议使用枚举类
 * 3.如果枚举类中只有一个对象,则可以作为单例模式的实现方式
 *
 * 二.如何定义枚举类
 * 方式一:jdk之前,自定义枚举类
 * 方式二:jdk5.0,可以使用enum关键字定义枚举类
 *
 * 三.Enum类中的常用方法
 *
 * 四.使用enum关键字定义的枚举类实现接口的情况
 *      情况一:实现接口,在enum类中实现抽象方法
 *      情况二:让枚举类的对象分别实现接口中的抽象方法
 */
public class SessionDemo {
    public static void main(String[] args) {
        Session autumn = Session.AUTUMN;
        System.out.println("autumn = " + autumn);
    }
}

// 自定义枚举类
class Session {
    private final String sessionName;
    private final String sessionDesc;

    // 私有化类的构造器,并给对象属性赋值
    private Session(String sessionName, String sessionDesc) {
        this.sessionName = sessionName;
        this.sessionDesc = sessionDesc;
    }

    // 提供当前枚举类的多个对象:public static final
    public static final Session SPRING = new Session("春天", "春暖花开");
    public static final Session SUMMER = new Session("夏天", "夏日炎炎");
    public static final Session AUTUMN = new Session("秋天", "秋高气爽");
    public static final Session WINTER = new Session("冬天", "冰天雪地");

    // 获取枚举类对象的属性
    public String getSessionName() {
        return sessionName;
    }

    public String getSessionDesc() {
        return sessionDesc;
    }

    @Override
    public String toString() {
        return "Session{" +
                "sessionName='" + sessionName + '\'' +
                ", sessionDesc='" + sessionDesc + '\'' +
                '}';
    }
}
