package com.itheima._Demo04;

import java.io.*;

public class Test_01 {
    public static void main(String[] args) throws IOException {

        // 创建带缓冲区的字节输入流对象
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("Day10_ten\\aaa.txt"));
        // 创建带缓冲区的字节输出流对象
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("Day10_ten\\aaa.txt"));
        //读取后再写入
        int len ;
        while((len=fis.read())!=-1){
            //写入
            fos.write(len);
        }
        //关闭输出流
        fos.close();
        //关闭输入流
        fis.close();
    }
}
