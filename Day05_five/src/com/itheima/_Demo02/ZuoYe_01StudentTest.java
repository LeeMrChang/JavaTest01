package com.itheima._Demo02;

/**
 *  问题：
 *  * 请使用代码实现
 *  * 每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
 *  * 如果老师给学生赋值一个负数,抛出一个自定异常
 */
public class ZuoYe_01StudentTest {

    public static void main(String[] args) {

        Student stu = new Student();

        stu.setScore(100.0);

        stu.setScore(-5.5);
    }
}
