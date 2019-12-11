package com.itheima._Demo01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 创建客户端
 */
public class ClientTCP {
    public static void main(String[] args)throws IOException {
        System.out.println("客户端 发送数据");
        //1、创建客户端对象，并指定 并指定连接服务器的ip和端口号6666
        Socket clinet = new Socket("192.168.70.114",6666);
        //2、写一个数据过去，获取流对象，输出流
        OutputStream out = clinet.getOutputStream();
        //3、写数据
        out.write("HelloWord!,Lin".getBytes());
        //关闭流
        out.close();
        //关闭客户端
        clinet.close();

    }
}
