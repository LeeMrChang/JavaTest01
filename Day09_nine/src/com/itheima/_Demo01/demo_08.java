package com.itheima._Demo01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输出流
 *    Reader类
 *  字符输入流
 *    Writer类
 */
public class demo_08 {
    public static void main(String[] args) throws IOException {
        //创建字符输出流对象
        FileReader fos = new FileReader("Day09_nine\\readerMe.txt");

        //定义一个临时字符数组，
        char[] cha = new char[2];


        //定义一个int变量来接收 读取到的字符个数
        int v;

        while((v=fos.read(cha))!=-1){
            System.out.println(new String(cha,0,v));
        }

        fos.close();
    }
}
