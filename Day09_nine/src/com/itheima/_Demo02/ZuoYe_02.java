package com.itheima._Demo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/***
 * 描述:利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"。
 */
public class ZuoYe_02 {
    public static void main(String[] args) throws IOException {
            //创建字节输出流
        FileOutputStream fos = new FileOutputStream("D:\\b.txt");
        //使用字节数组的方式输出
        //将字符转换成字节形式添加进去
        fos.write("i ".getBytes());

        fos.write("love ".getBytes());

        fos.write("java".getBytes());


        //关闭
        fos.close();

    }
}
