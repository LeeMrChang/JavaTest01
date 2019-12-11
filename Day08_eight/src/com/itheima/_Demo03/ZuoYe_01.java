package com.itheima._Demo03;

import java.io.File;

/**
 * 描述:创建两个文件对象，分别使用相对路径和绝对路径创建。
 */
public class ZuoYe_01 {
    public static void main(String[] args) {
            //绝对路径创建文件夹路径
        //使用File类的一个参数的构造方法
        File file = new File("D:\\IdeaProjects");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());//
        //使用Fi了类的两个参数的构造方法,相对路径
        File f = new File("Day08_eight\\aaa");
        System.out.println(f.getAbsolutePath());//获取绝对路径
        System.out.println(f.exists());
    }
}
