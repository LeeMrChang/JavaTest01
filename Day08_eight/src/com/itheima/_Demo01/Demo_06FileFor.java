package com.itheima._Demo01;

import java.io.File;

/**
 * 目录的遍历
 */
public class Demo_06FileFor {

    public static void main(String[] args) {

        File file = new File("D:\\IdeaProjects\\Code01");

        //获取当前目录下与文件以及文件夹的名称
        String[] names = file.list();

        for (String name : names) {
            System.out.println(name);
        }

        //获取当前目录下的文件以及文件夹对象，只要拿到了文件对象，那么就可以获得更多信息
        File[] dir = file.listFiles();

        for (File ter : dir) {
            System.out.println(ter);
        }

    }
}
