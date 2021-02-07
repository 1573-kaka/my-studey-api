package com.imust.crm.genericity;

import java.util.ArrayList;
import java.util.List;

public class Generic<T> {

    Integer gid;
    String nickName;

    T genericT;

    public Generic() {};

    public Generic(Integer gid, String nickName, T genericityT) {
        this.gid = gid;
        this.nickName = nickName;
        this.genericT = genericityT;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public T getGenericT() {
        return genericT;
    }

    public void setGenericT(T genericityT) {
        this.genericT = genericityT;
    }

    @Override
    public String toString() {
        return "Genericity{" +
                "gid=" + gid +
                ", nickName='" + nickName + '\'' +
                ", genericityT=" + genericT +
                '}';
    }

    // 泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系
    // 泛型方法所属的类是不是泛型类都没有关系

    <T> List<T> copyFromArrayToList(T[] arr) {
        ArrayList<T> arrayList = new ArrayList<>();

        for (T t : arr) {
            arrayList.add(t);
        }

        return arrayList;
    }
}
