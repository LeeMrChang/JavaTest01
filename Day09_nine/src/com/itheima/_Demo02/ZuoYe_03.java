package com.itheima._Demo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*8
描述:在D盘下，有一c.txt 文件中内容为：HelloWorld
在c.txt文件原内容基础上，添加五句 I love java，而且要实现一句一行操作(注：原文不可覆盖)。
利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”

 */
public class ZuoYe_03 {
    public static void main(String[] args) throws IOException {
            //创建字节输出流对象 不清空原有数据的情况下再追加字节
        FileOutputStream fos = new FileOutputStream("D:\\c.txt",false);
        //续写
        fos.write("\r\n".getBytes());
        fos.write("i love java".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("i love java".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("i love java".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("i love java".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("i love java".getBytes());

        //关闭
        fos.close();

    }
}
