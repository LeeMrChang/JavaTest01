package com.itheima._Demo01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器端
 */
public class ServerTCP {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket类的构造
        //Socket client = new Socket("127.0.0.1",6666);
        System.out.println("服务器端启动，等待连接.......");
        //1、创建服务端ServerSocket类对象，绑定端口号
        ServerSocket server = new ServerSocket(6666);
        //2、调用accept方法，等待客户端连接... 如果没有连接，阻塞
        //有客户端连接返回，连接对象 这里已经创建了一个流
        Socket socket = server.accept();
        //3、读数据，需要输入流通过socket获得
        InputStream in = socket.getInputStream();
        //4、读数据  一次性读取数据  使用字节数组
        byte[] buffer = new byte[1024];
        int len = in.read(buffer);
        //解析数组
        String mgs = new String(buffer, 0, len);

        System.out.println("客户端说：" + mgs);
        //释放资源
        in.close();
        //关闭客户端
        socket.close();


    }
}

