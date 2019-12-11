package com.itheima._Demo03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 使用字符缓冲流读取文件内容
 */
public class Test_01 {
    public static void main(String[] args) throws IOException {

        //创建字符缓冲输入流，再传入基本字符输入流并关联文件夹
        BufferedReader red = new BufferedReader(new FileReader("Day09_nine\\静夜思.txt"));
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
