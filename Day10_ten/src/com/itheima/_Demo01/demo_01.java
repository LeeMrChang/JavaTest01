package com.itheima._Demo01;

import java.io.*;

/**
 * 如何创建缓冲流
 */
public class demo_01 {

    public static void main(String[] args) throws FileNotFoundException {
        //创建缓冲流，先创建基本流
        //输入基本流
        FileInputStream fas = new FileInputStream("Day10_ten\\a.txt");
        //创建输入缓冲流
        BufferedInputStream buf = new BufferedInputStream(fas);
        //创建输出缓流
        FileOutputStream fos = new FileOutputStream("Day10_ten\\a.txt");
        //创建输出缓冲流
        BufferedOutputStream bof = new BufferedOutputStream(fos);
    }
}
