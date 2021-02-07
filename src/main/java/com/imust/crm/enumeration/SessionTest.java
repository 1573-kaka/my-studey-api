package com.imust.crm.enumeration;

/**
 * 使用enum关键字定义枚举类
 *      定义的枚举类默认继承于java.lang.Enum类
 */
public class SessionTest {
    public static void main(String[] args) {
        Show autumn = Show.AUTUMN;
        autumn.show();
        System.out.println("autumn = " + autumn);
        System.out.println("-----------------------");

        Show[] values = Show.values();
        for (Show value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("-----------------------");

        Thread.State[] states = Thread.State.values();
        for (Thread.State state : states) {
            System.out.println("state = " + state);
        }
        System.out.println("-----------------------");

        Show show = Show.valueOf("SPRING");
        System.out.println("show = " + show);
    }
}

interface info {
    void show();
}

// 使用enum关键字定义枚举类
enum Show implements info {
    SPRING("春天", "春暖花开") {
        @Override
        public void show() {
            System.out.println("春天在哪里?");
        }
    },
    SUMMER("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天", "秋高气爽") {
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天", "冰天雪地") {
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

    private final String name;
    private final String desc;

    private Show(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName(String name) {
        return name;
    }

    public String getDesc(String desc) {
        return desc;
    }

    /*@Override
    public String toString() {
        return "Show{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }*/

}
