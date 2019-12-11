package com.itheima._Demo03;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //创建四个学生对象

        ArrayList<Student> list = new ArrayList<>();
        //添加四个学生元素
        list.add(new Student("李元芳",10));
        list.add(new Student("后裔",28));
        list.add(new Student("公孙离",16));
        list.add(new Student("狄仁杰",26));
        /**
         * 让学生按照年龄排序，升序
         *
         */;
        System.out.println(list);
        for(Student stu :list){
            System.out.println(stu);
        }
    }
}
