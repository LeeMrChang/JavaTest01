package com.itheima._Demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *描述:利用字节输入流读取D盘文件b.txt的内容，文件内容确定都为纯ASCII字符
 * ,使用循环读取，一次读取一个字节数组，直到读取到文件末尾，
 * 将读取到的字节数组转换成字符串输出到控制台。
 */
public class ZuoYe_05 {

    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fas = new FileInputStream("D:\\b.txt");
        //创建一个字节数组，一次读取一个字节数组，读取到末尾
        byte[] buffer = new byte[2];
        //定义一个变量来接收字节的个数
        int b;
        //遍历
        while((b=fas.read())!=-1){
            System.out.print((char)b);
        }

        //关闭
        fas.close();
    }
}
