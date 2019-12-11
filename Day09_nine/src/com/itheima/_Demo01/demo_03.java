package com.itheima._Demo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 换行操作
 * 在Windows中 \r\n是一个换行操作
 */
public class demo_03 {

    public static void main(String[] args) throws IOException {
        //创建字节流输出对象
        FileOutputStream fos = new FileOutputStream("Day09_nine\\静夜思.txt");
        //添写操作
        fos.write("床前明月光，".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("疑是地上霜。".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("举头望明月，".getBytes());
        fos.write("\r\n".getBytes());
        fos.write("低头思故乡。".getBytes());
        //关闭流
        fos.close();

    }
}
