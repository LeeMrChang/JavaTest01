package com.itheima._Demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**描述:利用字节流将E盘下的a.png图片复制到D盘下(文件名保存一致)
   要求：一次读写一个字节的方式
 *
 */
public class ZuoYe_06 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象  输入源
        FileInputStream fas = new FileInputStream("C:\\test.jpg");
        //创建字节输出流对象  输出目标
        FileOutputStream fos = new FileOutputStream("D:\\sun.jpg");
        //先读取
        //定义一个临时字节数组
        byte[] buffer = new byte[1024];
        //定义一个变量来接收此字节的个数
        int len; ;
        //遍历读取后再写入D盘
        while((len=fas.read())!=-1){
            //写入D盘
            fos.write(buffer,0,len);
        }

        //关闭
        fas.close();
        fos.close();

    }
}
