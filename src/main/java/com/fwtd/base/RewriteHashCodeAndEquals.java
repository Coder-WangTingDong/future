package com.fwtd.base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * 重写hashcode和equals
 */
public class RewriteHashCodeAndEquals {
    public static void main(String[] args) {
        Student student1 = new Student("lili", 11);
        Student student2 = new Student("lili", 11);
        //System.out.println(student1.hashCode());
        //System.out.println(student2.hashCode());
        Set<Student> set = new HashSet<>();
        set.add(student1);
        set.add(student2);
        System.out.println(set.size());
    }
}

@Setter
@Getter
@EqualsAndHashCode
class Student{
    
    String name;

    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}