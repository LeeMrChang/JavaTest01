package com.itheima._Demo02;

import java.util.HashSet;

//定义人类，包含姓名和年龄属性。创建4个人存储到HashSet中，姓名和年龄相同的人看做同一人不存储。
public class ZuoYe_02PersonTest {

    public static void main(String[] args) {

        //创建HashSet
        HashSet<Person> son = new HashSet<>();
        //添加元素
        son.add(new Person("后裔",19));
        son.add(new Person("鲁班",10));
        son.add(new Person("狄仁杰",21));
        son.add(new Person("后裔",19));
        //重写equals方法，
        System.out.println(son);

    }
}
