package com.itheima._Demo03;

import java.io.*;
import java.net.Socket;

/**
 * 模拟客户端与服务器之间上传文件
 */
public class File_Client {
    public static void main(String[] args) throws IOException {
        //1、创建客户端网络编程对象，执行服务地址与端口号
        Socket clinet = new Socket("192.168.70.114", 8888);
        //2、创建字节输入流 ，用来读取硬盘上的文件信息、
        FileInputStream fas = new FileInputStream("Day11_eleven\\Clinent\\test.jpg");
        //3、使用客户端获取字节输出流，把读取的文件信息再写出到客户端与服务器之间
        OutputStream out = clinet.getOutputStream();
        //2.1读取该路径里的文件信息
        byte[] buffer = new byte[1024];//创建字节数组，一次读取一个字节数组
        int len;//定义一个变量来接收字节的个数
        while ((len = fas.read(buffer)) != -1) {
            //此时数据在客户端内存中，将数据写出
            out.write(buffer, 0, len);
        }
        //通知服务器，客户端停止写的操作了
        //禁用此输出流，将之前所传的文件全部上传
        clinet.shutdownOutput();

        System.out.println("客户端：文件上传完毕！");
        //接收数据，读取数据
        InputStream in = clinet.getInputStream();
        byte[] bys = new byte[1024];
        int b = in.read(bys);
        System.out.println(new String(bys,0,b));


        //释放资源
        in.close();
        out.close();
        fas.close();
        //关闭客户端
        clinet.close();
    }
}
