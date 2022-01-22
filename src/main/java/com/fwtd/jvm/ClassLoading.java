package com.fwtd.jvm;

/**
 * @classname: ClassLoading
 * @description:
 * @date: 2021/12/16/10:37 下午
 * @author: wangtingdong
 * @email: it_wangtingdong@163.com
 */
public class ClassLoading {
    public static void main(String[] args) {
        System.out.println(T.count);
        System.out.println(T1.count);
    }
}

class T {
    public static int count = 2;
    public static T t = new T();
    public T() {
        count++;
    }
}

class T1 {
    public static T1 t = new T1();
    public static int count = 2;
    public T1() {
        count++;
    }
}