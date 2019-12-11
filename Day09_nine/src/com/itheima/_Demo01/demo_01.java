package com.itheima._Demo01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo_01 {
    public static void main(String[] args) throws IOException {
        //创建目的文件
        File file = new File("Day09_nine\\a.txt");
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream(file);
        //传入文件路径即可
        FileOutputStream fas = new FileOutputStream("Day09_nine\\hello.txt");
        //
        //fos.write(97);
        //写Hello Word
        byte[] bytes = "hello word".getBytes();
        //此方法只能写入字节，所有需要先把字符串转换为字节数组，然后再写入
        fos.write(bytes);
        //关闭此文件输出流并释放与此流有关的所有系统资源
        //关闭此文件输出流并释放与此流有关的所有系统资源，写完最好都得写上
        fos.close();

    }
}
