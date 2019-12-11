package com.itheima._Demo07;

import java.io.*;
import java.net.Socket;

/**
 * 模拟客户端向服务器上传文件
 */
public class CilentTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端上传文件");

        // 1.创建流对象
        Socket ket = new Socket("192.168.70.114",6666);
        //  1.1 创建输入流,读取本地文件 
        BufferedOutputStream fos = new BufferedOutputStream(ket.getOutputStream());
        // 1.2 创建输出流,写到服务端,带缓冲区的输出流对象
        BufferedInputStream fas = new BufferedInputStream(new FileInputStream("Day11_eleven\\Cilent\\test.jpg"));
        byte[] buffer = new byte[1024*8];
        int len;
        while((len=fas.read(buffer))!=-1){
            //2.写出数据
            fos.write(buffer,0,len);
        }
        //禁止此输出流，所有写出的内容将被上传
        ket.shutdownOutput();
        System.out.println("文件开始上传！");
        InputStream in = ket.getInputStream();
        byte[] bytes = new byte[1024*8];
        int line = in.read(bytes);
        String mgs = new String(bytes, 0, line);

        System.out.println("服务端："+mgs);

        // 3.释放资源
        fos.close();
        fas.close();
        ket.close();


    }
}
