package com.itheima._Demo04;

import java.io.*;

public class Test_02 {
    public static void main(String[] args) throws IOException{
        //创建带缓冲区的字符输出流
        BufferedWriter fis = new BufferedWriter(new FileWriter("Day10_ten\\xxx.txt"));
        //写出字符
       fis.write("林小时");
       fis.newLine();
        //创建带缓冲区的字符输入流
       BufferedReader fos = new BufferedReader(new FileReader("Day10_ten\\xxx.txt"));
        //读取字符
        fos.read();
        fos.readLine();
        //关闭输出流
        fis.close();
        //关闭输入流
        fos.close();

    }
}
