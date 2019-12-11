package com.itheima._Demo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 需求说明：从控制台接收3名学员的信息，每条信息存储到一个Student对象中，
 * 将多个Student对象存储到一个集合中。输入完毕后，将所有学员信息存储到文件Student.txt中。
 * 每名学员信息存储一行，多个属性值中间用逗号隔开。
 */
public class ZuoYe_11 {
    public static void main(String[] args) throws IOException {
        //创建键盘录入
        Scanner sc = new Scanner(System.in);
        //把3个学生对象储存到一个集合，
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 1; i <=3 ; i++) {
            //录入学生姓名
            System.out.println("请输入姓名：");
            String str = sc.next();
            //录入学号
            System.out.println("请输入学号：");
            int num = sc.nextInt();
            //将键盘录入的学院信息储存到Student对象中
            Student stu = new Student(str,num);
            list.add(stu);

        }
        //将所有学院信息储存到文件Student.txt中
        //创建输出流对象

        FileOutputStream fos = new FileOutputStream("Day09_nine\\Student.txt");
                Student stu;
        //遍历集合
        //每名学员信息储存一行
        for (int i = 0; i < list.size(); i++) {
            stu = list.get(i);
            fos.write(((stu.getName()+","+stu.getXue())+"\r\n").getBytes());

        }

        fos.close();
    }
}
