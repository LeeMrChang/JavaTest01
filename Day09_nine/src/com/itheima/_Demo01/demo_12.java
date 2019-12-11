package com.itheima._Demo01;

import java.io.*;

public class demo_12 {
    public static void main(String[] args) throws IOException {
        //创建字节（读）输入流对象   指定数源
        FileInputStream fos = new FileInputStream("D:\\test.jpg");
        //创建字节（写）输出流对象   指定目标
        FileOutputStream fas = new FileOutputStream("test_copy.jpg");
        //读写数据，定义数组
        byte[] b = new byte[1024];
        //定义长度
        int len ;
        //遍历
        while((len = fos.read(b))!=-1){
            fas.write(b,0,len);
        }
        //关闭资源
        fos.close();
        fas.close();

    }
}
