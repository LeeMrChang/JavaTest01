package com.itheima._Demo03;

import java.io.File;
import java.io.FileFilter;

/**
 *获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
 */
public class ZuoYe_10 {

    public static void main(String[] args) {

        File f =  new File("D:\\aaa");
            //文件过滤器的重写方法
        /*File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
               if(pathname.getName().endsWith(".txt")){
                   return true;
               }else{
                   return false;
               }
            }
        });*/
        File[] files1 = f.listFiles( flie ->{
            return f.getName().endsWith(".txt")||f.isDirectory();
        });

        for (File file : files1) {
            System.out.println(file);
        }
    }
}
