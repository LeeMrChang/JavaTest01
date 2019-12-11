package com.itheima._Demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 在D盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
 * 定义一个方法统计test.txt文件中’a’字符出现的次数。
 * 比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次
 */
public class ZuoYe_09 {
    public static void main(String[] args) throws IOException {
            //创建字符输出流的对象  读取字符
        FileReader frt = new FileReader("D:\\a.txt");
        count(frt);


    }

    public static void count(FileReader file) throws IOException {
        //获取此文件的内容，计算字符’a‘出现的次数
        //定义一个变量来接收字符的个数，再定义一个变量来计算字符a出现的次数
        int b;
        int count = 0;
        //遍历此文件
        while((b=file.read())!=-1){
            //判断获取字符a
            System.out.println((char)b);
            if('a'==(char)b){
                count++;
            }
        }

        System.out.println("a出现的次数："+count);

        //
        file.close();



    }
}
