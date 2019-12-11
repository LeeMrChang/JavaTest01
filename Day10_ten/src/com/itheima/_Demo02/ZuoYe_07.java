package com.itheima._Demo02;

import java.io.*;

/**
 * 描述:定义一个学生类，包含姓名，年龄，性别等成员变量，提供setters和getters方法以及构造方法。
 * 在测试类中创建一个学生对象，给学生对象的三个成员变量赋值。
 * 然后将该对象保存到当前项目根目录下的stu.txt文件中。
 * 答案
 */
public class ZuoYe_07 {
    public static void main(String[] args)throws IOException {

        //创建学生对象
        Student stu = new Student("小林",18,"女");
        //创建序列化字符对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Day10_ten\\stu.txt"));
        //写入输出此学生对象
        out.writeObject(stu);
        //关闭流
        out.close();
    }
}
