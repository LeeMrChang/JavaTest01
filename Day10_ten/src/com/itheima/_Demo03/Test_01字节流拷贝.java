package com.itheima._Demo03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_01字节流拷贝 {

    public static void main(String[] args) throws IOException {
        //1、创建输入流对象
        FileInputStream fas = new FileInputStream("Day10_ten\\test.jpg");
        //2、创建输出流对象
        FileOutputStream fos = new FileOutputStream("Day10_ten\\tests.jpg");
        //3、使用输入流读取,使用一个数组字节一个数组字节读取
        byte[] buffer = new byte[1024];
        int b;
        while((b=fas.read())!=-1){
            //4、使用输出流写出
            fos.write(b);
        }

        //5、关闭输出流
        fos.close();
        //6、关闭输入流
        fas.close();
    }

    private static void print() throws IOException {
        // 1. 创建输入流对象
        FileInputStream fis = new FileInputStream("Day10_ten\\悟空.jpg");
        // 2. 创建输出流对象
        FileOutputStream fos = new FileOutputStream("Day10_ten\\test.jpg");
        // 3. 使用输入流读取,一个字节一个字节的方式拷贝先
        int b;//定义变量用来接收字节的个数
        //解析遍历
        while ((b = fis.read()) != -1) {
            //4。使用输出流写出
            fos.write(b);
        }

        // 5. 关闭输出流
        fos.close();
        // 6. 关闭输入流
        fis.close();
    }
}
