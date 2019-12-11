package com.itheima._Demo03;

import java.io.File;
import java.io.IOException;

/**
 * 获取D盘aaa文件夹中b.txt文件的文件名，文件大小，
 * 文件的绝对路径和父路径等信息，并将信息输出在控制台
 */
public class ZuoYe_06 {
    public static void main(String[] args) throws IOException {
        //创建文件类对象
        File file = new File("D:\\aaa");
        file.mkdirs();
        System.out.println("文件名："+file.getName());

        File f = new File("D:\\aaa\\b.txt");
        if(file.exists()){
            if(!f.exists()){
                f.createNewFile();
            }
        }
        System.out.println("文件大小："+f.length());
        System.out.println("获取文件的绝对路径："+f.getAbsolutePath());
        System.out.println("获取父文件夹路径，返回字符串："+f.getParent());
        System.out.println("获取父文件夹路径，返回的是文件对象"+f.getParentFile());


    }
}
