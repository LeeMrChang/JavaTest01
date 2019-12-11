package com.itheima._Demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 输入流读取的遍历方法
 */
public class demo_05 {

    public static void main(String[] args) throws IOException {
        //创建输入流字节对象
        FileInputStream fas = new FileInputStream("Day09_nine\\hello.txt");
        //定义一个变量，把读取的字节赋值给这个变量
        int v ;
        //因为不知文件夹中有多少文件，所以用while循环遍历
        while((v=fas.read())!=-1){//条件判断，如果字节不等于-1的情况下把字节赋值给v
            System.out.print((char)v);
        }

        fas.close();
    }
}
