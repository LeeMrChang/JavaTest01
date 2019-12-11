package com.itheima._Demo01;

import java.io.*;

public class demo_02 {
    public static void main(String[] args) {
        //定义开始计算时间
        long start = System.currentTimeMillis();

        try (
                //创建输入流对象
                FileInputStream fas = new FileInputStream("Day10_ten\\悟空.jpg");
                //创建缓冲流
                BufferedInputStream f = new BufferedInputStream(fas);
                //创建输出流对象
                FileOutputStream fos = new FileOutputStream("Day10_ten\\tesqt.jpg");
                BufferedOutputStream w = new BufferedOutputStream(fos);
        ) {//逻辑思维的代码
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fas.read(buffer)) != -1) {
                fos.write(buffer,0,len);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();

        System.out.println("复制的时间："+(end-start));
    }
}
