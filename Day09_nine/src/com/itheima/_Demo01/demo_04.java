package com.itheima._Demo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo_04 {

    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fas = new FileInputStream("Day09_nine\\hello.txt");
        //执行读的操作
        //使用public abstract int read() 方法
        int read1 = fas.read();
        System.out.println((char) read1);
        int read2 = fas.read();
        System.out.println((char) read2);
        int read3 = fas.read();
        System.out.println((char)read3);
        int read4 = fas.read();
        System.out.println((char)read4);
        int read5 = fas.read();
        System.out.println((char)read5);

        fas.close();
    }

}
