package com.itheima._Demo04;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
            //创建File类对象
        File file = new File("D:\\aaa\\fff");

        File[] dir = file.listFiles();

        for (File files : dir) {
           // System.out.println("!");
            //获取文件或者文件名
            String name = files.getName();
            //判断是一个文件或者以.txt结尾的文件
            if(files.isFile()&&name.endsWith(".txt")){
                System.out.println(files);
            }
        }
        
    }
}
