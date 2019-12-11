package com.itheima._Demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ZuoYe_12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        //创建反序列化对象
        ObjectInputStream fos = new ObjectInputStream(new FileInputStream("Day10_ten\\stus.txt"));
        //d读取文件中内容
       List<Student> list = (List<Student>) fos.readObject();

        for (Student student : list) {
            System.out.println(student);
        }

        fos.close();

    }
}
