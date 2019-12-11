package com.itheima._Demo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * IO流的续写操作
 */
public class demo_02 {
    public static void main(String[] args) throws Exception {

        //创建字节输出流对象,创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
        //判断结果为true，即续写（追加）字节（字符串），如果判断为false，即为清空了
        FileOutputStream fos = new FileOutputStream("Day09_nine\\hello.txt",true);
        //续写
        fos.write("fghjklmnopqrist".getBytes());
        //关闭此输出流
        fos.close();
    }
}
