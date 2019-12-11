package com.itheima._Demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class demo_07 {

    public static void main(String[] args) throws IOException {
        //创建输入流字节对象
        FileInputStream fas = new FileInputStream("Day09_nine\\hello.txt");
        //定义一个临时字节数组
        byte[] bty = new byte[2];
        //定义一个变量来接收字节数组的长度
        int b ;
        //循环、
        while((b=fas.read(bty))!=-1){//判断字节不为-1.就是文件中有内容、有字节
            for (int i = 0; i < b; i++) {
                System.out.print((char)bty[i]);
            }
        }
        //System.out.println(new String(bty,0,b));
        fas.close();

    }
}
