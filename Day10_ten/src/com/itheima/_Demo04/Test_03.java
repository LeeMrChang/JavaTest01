package com.itheima._Demo04;

import java.io.*;

public class Test_03 {
    public static void main(String[] args) throws IOException {
        // 转换流的输入流, 通过指定的字符集, 将字节转换成字符
        ObjectInputStream fis = new ObjectInputStream(new FileInputStream("gbk"));
        // 转换流的输出流, 通过指定的字符集, 将字符转换成字节
        ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("UTF-8"));
        int c;
        while((c=fis.read())!=-1){
            //写出
            fos.write(c);
        }
        //关闭输出六
        fos.close();
        fis.close();
    }
}
