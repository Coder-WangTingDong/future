package com.fwtd.thread;

import org.openjdk.jol.info.ClassLayout;

public class Test01 {
    int i = 0;// 4bytes
    long num = 0l;// 8bytes
    Student student = new Student();// 4bytes
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        System.out.println(ClassLayout.parseInstance(test01).toPrintable());
    }
}
class Student {
    String name;
    int age;
}