package com.itheima._Demo01;

import java.io.File;

/**
 *  了解File的构造
 */
public class Demo_01File {

    public static void main(String[] args) {

        //根据路径，封装file对象，封装文件夹、
        File file = new File("D:\\IdeaProjects\\JiuYeBan\\Day08_eight");

        System.out.println(file);

        //封装文件夹目录
        File dir = new File("D:\\IdeaProjects");

        System.out.println(dir);

        //根据父路径File形式与子路径封装成一个新的File的文件
        File file2 = new File(dir,"JiuYeBan\\Day08_eight");

        System.out.println(file2);

        //根据父路径的字符串形式与子路阱封装成一个新的File的文件夹
        File file3 = new File("D:\\IdeaProjects","JiuYeBan\\Day08_eight");

        System.out.println(file3);

    }
}
