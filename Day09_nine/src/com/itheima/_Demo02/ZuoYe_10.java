package com.itheima._Demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 * 从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
 * 将学生信息保存到D盘下面的stu.txt文件中，一个学生信息占据一行数据。
 * 当用户输入end时停止输入。
 * 1.	使用Scanner类进行键盘录入数据
 * 2.	创建字节输入流对象关联目标文件
 * 3.	使用死循环不停的接收用户输入的学生数据
 * 4.	接收用户输入的学生数据
 * 5.	判断输入的内容是否是end，是则终止循环，停止输入。否则就数据写出到文件中。
 */
public class ZuoYe_10 {

    public static void main(String[] args) throws IOException {
        //创建键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入内容：");

        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("Day09_nine\\stu.txt");
        //创建字节输入流对象关联目标文件
        //FileInputStream file = new FileInputStream(str);
        //使用死循环不停的接收用户输入的学生数据
        //定义一个变量来接收字节的个数
        //int b;
        while (true) {
            String str = sc.nextLine();
            if(str.equals("end")){
                break;
            }else{
                fos.write(str.getBytes());
                fos.write("\r\n".getBytes());
            }
        }

        fos.close();
    }


}

