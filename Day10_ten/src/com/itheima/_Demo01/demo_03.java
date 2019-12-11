package com.itheima._Demo01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo_03 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流，再传入基本字符输入流并关联文件夹
        BufferedReader red = new BufferedReader(new FileReader("Day10_ten\\静夜思.txt"));
        //使用字符缓冲流遍历读取文件夹内容
        //定义一个字符串类型遍历来接收文件夹内容
        String line;
        //遍历循环读取
        while((line=red.readLine())!=null){//readLine是可以一行一行地读取
            System.out.println(line);
        }

        //关闭流
        red.close();
    }

}
