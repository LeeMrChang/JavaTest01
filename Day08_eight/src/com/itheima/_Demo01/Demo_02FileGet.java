package com.itheima._Demo01;

import java.io.File;

/**
 *public String getAbsolutePath() ：返回此File的绝对路径名字符串。
 * public String getPath() ：将此File转换为路径名字符串。
 * public String getName() ：返回由此File表示的文件或目录的名称。
 * public long length() ：返回由此File表示的文件的长度。
 */
public class Demo_02FileGet {

    public static void main(String[] args) {
        //创建文件夹路径
        File file = new File("D:\\java文件夹\\HelloWord.txt");
        System.out.println(file);

        System.out.println("文件夹绝对路径："+file.getAbsolutePath());
        System.out.println("文件夹构造路径："+file.getPath());
        System.out.println("文件名称："+file.getName());
        System.out.println("文件长度"+file.length()+"字节");

        System.out.println("=======================");

        File f = new File("D:\\java文件夹\\HelloWord.txt");

        System.out.println("目录绝对路径："+f.getAbsolutePath());
        System.out.println("目录构造路径："+f.getPath());
        System.out.println("目录名称："+f.getName());
        System.out.println("目录长度："+f.length());
    }
}
