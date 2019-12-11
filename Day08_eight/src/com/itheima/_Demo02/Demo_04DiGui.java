package com.itheima._Demo02;

import java.io.File;

/**
 *
 */
public class Demo_04DiGui {
    public static void main(String[] args) {

        //创建File对象
        File dir = new File("D:\\IdeaProjects");
        //调用打印目录方法
        printDir(dir);
    }

    public static void printDir(File dir){
            //获取子目录和目录
        File[] files = dir.listFiles();
        //循环打印
        /**
         * 判断：
         * 当是文件夹时，打印绝对路径
         * 当是目录时，继续调用打印目录的方法，形成递归使用
         */
        for (File file : files) {
            //判断
            if(file.isFile()){
                //是文件，输出文件绝对路径
                System.out.println("文件名："+file.getAbsolutePath());
            }else{
                //是目录时，输出目录绝对路径
                System.out.println("目录："+file.getAbsolutePath());
                //继续遍历，调用printDir，形成递归
                printDir(file);
            }
        }

    }
}
