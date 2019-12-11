package com.itheima._Demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 */
public class demo_06 {
    public static void main(String[] args) throws IOException {
        //创建输入流字节对象
        FileInputStream fas = new FileInputStream("Day09_nine\\hello.txt");
        //创建一个临时字节数组，用来遍历
        byte[] bty = new byte[2];
        //读取字节
        int read = fas.read(bty);
        //字节个数
        System.out.println(read);
        //遍历这个字节数组
        for (byte b : bty) {
            System.out.println((char)b);//h e
        }
        //再继续读取字节
        int dter = fas.read(bty);
        //再次遍历此字节数组
        for (byte b : bty) {
            System.out.println((char)b);// l l
        }
        fas.close();
    }
}
