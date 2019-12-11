package com.itheima._Demo01;
/**
 * File判断功能方法
 */

import java.io.File;

public class Demo_04FileIs {

    public static void main(String[] args) {

        File file = new File("D:\\IdeaProjects\\Code01");
        File f = new File("D:\\IdeaProjects\\JiuYeBan\\Day01_one");
        //判断是否存在以上的文件夹
        System.out.println("D:\\IdeaProjects\\JiuYeBan\\bbb是否存在："+file.exists());
        System.out.println("D:\\IdeaProjects\\JiuYeBan\\Day01_one是否存在："+f.exists());
        //判断是文件还是目录？
        System.out.println("D:\\java\\HelloWord.txt是文件？"+file.isFile());
        System.out.println("D:\\IdeaProjects\\JiuYeBan是目录？"+f.isDirectory());
    }
}
