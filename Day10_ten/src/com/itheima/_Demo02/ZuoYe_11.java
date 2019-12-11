package com.itheima._Demo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个学生类，成员变量有姓名，年龄，性别，提供setters和getters方法以及构造方法
 * 定义一个测试类，在测试类创建多个学生对象保存到集合中，然后将集合存储到当前项目根目录下的stus.txt文件中。
 * 答案
 */
public class ZuoYe_11 {
    public static void main(String[] args) throws IOException {

        //创建集合
        List<Student> list = new ArrayList<>();
        //创建过个学生对象
        Student stu1 = new Student("小林", 23, "女");
        Student stu2 = new Student("小奇", 25, "男");
        Student stu3 = new Student("小红", 24, "女");
        Student stu4 = new Student("小绿", 26, "男");
        //添加到集合中
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        //创建序列化对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Day10_ten\\stus.txt"));
        //写出
        out.writeObject(list);

        out.close();
    }
}
