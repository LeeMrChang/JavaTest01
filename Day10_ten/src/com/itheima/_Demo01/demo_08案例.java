package com.itheima._Demo01;

import java.io.*;

/**
 * 将指定的GBK文件 武功秘籍（GBK版）.txt转换成一个新的文件（UTF-8）
 * 1、创建一个字符输入流，读取GBK编码形式的文件
 *
 */
public class demo_08案例 {
    public static void main(String[] args) throws IOException {
        //写两个路径
        String wu = "Day10_ten\\武功秘籍（GBK版）.txt";
        String xin = "Day10_ten\\武功秘籍（UTF-8版）.txt";

        //转换流中的字符输入流
        InputStreamReader isr = new InputStreamReader(new FileInputStream(wu),"GBK");
        //将读取到的文件写到一个UTF-8的文件中
        //由于当前的项目编码就是UTF-8，直接使用FileW
        FileWriter ter = new FileWriter(xin);

        //使用转换流进行对应的读取
        int len ;
        char[] tt = new char[1024];
        while((len=isr.read(tt))!=-1){
            //tt字符数组写到文件中
            ter.write(tt,0,len);//使用默认编码
        }
        ter.close();
        isr.close();
    }
}
