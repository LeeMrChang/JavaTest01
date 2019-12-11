package com.itheima._Demo01;

import java.io.File;
import java.io.IOException;

/**
 * File的删除功能
 *
 */
public class Demo_05Delete {
    public static void main(String[] args) throws IOException {
        //文件的创建？
        File f = new File("D:\\java文件夹\\HelloWord.txt");

        System.out.println("是否存在："+f.exists());
        System.out.println("是否创建："+f.createNewFile());
        System.out.println("是否存在："+f.exists());

        System.out.println("======================");
        //目录的创建
        File f2 = new File("newDir");
        System.out.println("目录是否存在？"+f2.exists());
        System.out.println("是否创建新目录："+f2.mkdir());
        System.out.println("目录是否存在："+f2.exists());
        System.out.println("======================");
        //创建多级目录
        File f3 = new File("D:\\java文件夹\\HelloWord.txt");
        System.out.println("f3:"+f3.mkdir());
        File f4 = new File("D:\\java文件夹\\HelloWord.txt");
        System.out.println("f4:"+f4.mkdirs());
        //文件的删除
        //System.out.println("f:"+f.delete());
        //目录的删除
        //System.out.println("f2:"+f2.delete());
       // System.out.println("f4:"+f4.delete());
    }
}
