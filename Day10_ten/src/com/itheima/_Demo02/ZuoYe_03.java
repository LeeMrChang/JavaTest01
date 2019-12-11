package com.itheima._Demo02;

import java.io.*;

/**
 *描述:利用高效字节输入流和高效字节输出流完成文件的复制。
 * 要求：
 * 1.将C盘下的c.png文件复制到D盘下
 * 2.一次读写一个字节数组方式复制
 */
public class ZuoYe_03 {
    public static void main(String[] args) throws IOException {
        //创建高效字节输入流对象
        BufferedInputStream fas = new BufferedInputStream(new FileInputStream("C:\\test.jpg"));
        //创建高效字节输入流对象
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("D:\\kes.jpg"));
        //读取c盘下的c.jpg文件，解析并遍历
        //定义一个变量来接收所获取字节的个数
        int b;
        while((b=fas.read())!=-1){
            //输出此文件中的字节
            //一次读写一个字节数组的方式进行拷贝复制
            fos.write(b);
        }
        //关闭输出流
        fos.close();
        //关闭输入流
        fas.close();
    }
}
