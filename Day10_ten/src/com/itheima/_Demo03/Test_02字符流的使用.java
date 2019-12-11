package com.itheima._Demo03;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test_02字符流的使用 {
    public static void main(String[] args) throws IOException {
            //创建字符输出流
        FileWriter fws = new FileWriter("Day10_ten\\aaa.txt");
        //写出字符
        fws.write("费窗前");
        //创建字符输入流
        FileReader fis = new FileReader("Day10_ten\\aaa.txt");
        //读取字符流内容
        int i = fis.read();
        System.out.println((char)i);
        //关闭输出流
        fws.close();
        //关闭输入流
        fis.close();
    }
}
