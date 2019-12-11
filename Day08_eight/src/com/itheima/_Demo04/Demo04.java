package com.itheima._Demo04;

import java.io.File;
import java.io.FileFilter;

public class Demo04 {
    public static void main(String[] args) {
        //
        File f = new File("D:\\aaa\\fff");

        File[] files = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile()&&pathname.getName().endsWith(".txt");
            }
        });

        for (File file : files) {
            System.out.println(file);
        }
    }
}
