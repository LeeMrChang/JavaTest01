package com.itheima._Demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *使用反序列化对象
 */
public class ZuoYe_08 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建反序列化对象
        ObjectInputStream fas = new ObjectInputStream(new FileInputStream("Day10_ten\\stu.txt"));
        //读取学生对象
        Student str = (Student) fas.readObject();
        System.out.println(str);

        fas.close();
    }
}
