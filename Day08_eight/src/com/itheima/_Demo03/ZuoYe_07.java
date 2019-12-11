package com.itheima._Demo03;

import java.io.File;

/**
 * 判断File对象是否是文件,是文件则输出：xxx是一个文件，否则输出：xxx不是一个文件。
 * 2.判断File对象是否是文件夹,是文件夹则输出：xxx是一个文件夹，
 * 否则输出：xxx不是一个文件夹。(xxx是文件名或文件夹名)
 */
public class ZuoYe_07 {

    public static void main(String[] args) {
        //创建文件类对象
        File f = new File("D:\\aaa\\b.txt");
        //判断
        if(f.isFile()){
            System.out.println("文件对象："+f.getName());
        }else{
            System.out.println("不是一个文件"+f.getName());
        }
        //创建文件对象
        File file = new File("D:\\aaa");
        //判断
        if(file.isDirectory()){
            System.out.println(file.getName()+"是一个文件夹");
        }else {
            System.out.println(file.getName()+"不是一个文件夹");
        }

    }
}
