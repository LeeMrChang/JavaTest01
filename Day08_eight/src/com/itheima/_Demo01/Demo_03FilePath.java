package com.itheima._Demo01;
/**
 * 绝对路径
 * 相对路径
 */

import java.io.File;

public class Demo_03FilePath {

    public static void main(String[] args) {
        //绝对路径
        File file = new File("D:\\bbb.java.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

        //相对路径，就是项目下的D:\bbb.java文件
        File f = new File("bbb.java");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
    }
}
