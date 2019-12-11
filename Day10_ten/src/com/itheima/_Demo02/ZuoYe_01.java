package com.itheima._Demo02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 描述:利用高效字节输出流往C盘下的d.txt文件输出一个字节数。
 */
public class ZuoYe_01 {
    public static void main(String[] args) throws IOException {

        //创建缓冲流字节输出流对象
        BufferedOutputStream fer = new BufferedOutputStream(new FileOutputStream("Day10_ten\\h.txt"));
        //输出一个字节
        fer.write("dfghghjvb".getBytes());

        fer.close();
    }
}
