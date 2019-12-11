package com.itheima._Demo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*8
利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。
 */
public class ZuoYe_01 {
    public static void main(String[] args) throws IOException {
       //创建字节输出流对象
        FileOutputStream fas = new FileOutputStream("D:\\a.txt");
        //
        fas.write("a".getBytes());

        fas.close();

    }
}
