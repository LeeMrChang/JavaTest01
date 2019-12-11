package com.itheima._Demo04;

import java.io.File;

public class Demo05 {

    public static void main(String[] args) {

        print(new File("D:\\"));
    }

    public static void print(File file){
            //获取文件中所有的文件和文件夹C
        File[] files = file.listFiles();
        // 遍历数组, 获取每一个文件和文件夹 : 增强for
        if(files!=null){
            for (File file1 : files) {
                if(file1.isFile()){
                    System.out.println(file1);
                }else{
                    //如果是文件夹，获取这个文件夹下所有的文件
                    print(file1);
                }
            }
        }
    }
}
