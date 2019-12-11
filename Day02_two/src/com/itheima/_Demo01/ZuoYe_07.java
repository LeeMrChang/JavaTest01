package com.itheima._Demo01;
/*
九、(复杂，并不难)定义一个学生类Student，包含三个属性姓名、年龄、性别，
        创建三个学生对象存入ArrayList集合中。
        A：遍历集合遍历输出。
        B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
        */

import java.util.ArrayList;

public class ZuoYe_07 {

    public static void main(String[] args) {

        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        //创建Student对象
        Student stu1 = new Student("傅红雪",37,"男");
        Student stu2 = new Student("明月",28,"女");
        Student stu3 = new Student("燕南天",30,"男");
        //添加到集合
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //遍历集合并输出
        print(list);

        //求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
        change(list);
    }

    public static void print(ArrayList<Student> list){
        //遍历集合并输出
        for (Student stu : list) {
            System.out.println(stu);
        }

    }

    public static void change(ArrayList<Student> list){
            //定义一个变量来存放年龄
            int a = 0;
            //定义一个变量来存放最大的年龄索引
            int index = 0;
        for (int i = 0; i < list.size(); i++) {
            //第一个索引的年龄大于a
            if(list.get(i).getAge()>a){
                //然后赋值给index，
                index = i;
                a = list.get(i).getAge();
            }
        }
        System.out.println("年龄最大的是："+list.get(index));
        //修改年龄最大的那个人的名字为“小猪佩奇”
        list.get(index).setName("小猪佩奇");
        System.out.println(list);
    }


}
