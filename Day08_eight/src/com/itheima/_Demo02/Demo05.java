package com.itheima._Demo02;

import java.io.File;
import java.io.FileFilter;

public class Demo05 {
    public static void main(String[] args) {

        //创建文件类对象
        File file = new File("D:\\Java基础2018-Job_2");
        print(file);

    }

    public static void print(File dir){

        //创建匿名内部类，创建过滤器子类对象
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")||pathname.isDirectory();
            }
        });

        File[] fila = dir.listFiles(f->{
            return f.getName().endsWith("java")||f.isDirectory();
        });
        //循环打印
        for (File file : files) {
            if(file.isFile()){
                System.out.println("文件名："+file.getAbsolutePath());
            }else{
                print(file);
            }
        }

    }
}
