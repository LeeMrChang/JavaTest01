package com.itheima._Demo02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*8
  利用高效字节输出流往C盘下的e.txt文件写出一个字节数组数据，如写出：”i love java”
 */
public class ZuoYe_02 {
    public static void main(String[] args) throws IOException {

        //创建高效字节输出流对象
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("Day10_ten\\e.txt"));
        //输出一个字节数组数据
        fos.write("i love you".getBytes());

        fos.close();
    }
}
