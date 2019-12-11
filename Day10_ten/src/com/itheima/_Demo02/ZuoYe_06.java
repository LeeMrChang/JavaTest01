package com.itheima._Demo02;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**描述:利用转换输入流将当前项目根目录下使用gbk编码的a.txt文件的内容读取出来，并打印在控制台上。
 要求：不能出现乱码的情况。
 答案

 *
 */
public class ZuoYe_06 {
    public static void main(String[] args) throws IOException {
           //创建字符转换输入流对象
        InputStreamReader fas = new InputStreamReader(new FileInputStream("Day10_ten\\b.txt"),"gbk");
        //读取

        int len;
        while((len=fas.read())!=-1){
            System.out.println((char)len);
        }

        fas.close();
    }
}
