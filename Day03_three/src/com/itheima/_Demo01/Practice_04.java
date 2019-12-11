package com.itheima._Demo01;
/**
 * 使用HashSet存储自定义类型，必须重写自定义类型的hashCode和equals方法
 */

import java.util.HashSet;

public class Practice_04 {

    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        Student stu = new Student("赵本山",69);
        set.add(stu);
        set.add(new Student("宋丹丹",58));
        set.add(new Student("郭冬临",47));
        set.add(new Student("赵本山",69));
        //必须重写equals方法，
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
