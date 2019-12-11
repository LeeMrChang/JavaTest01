package com.itheima._Demo06;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端实现向服务端发送数据
 */
public class ClientTCP {
    public static void main(String[] args)throws IOException {
        System.out.println("客户端发送数据");
        // 1.创建 Socket ( ip , port ) , 并绑定IP地址与端口号
        Socket socket = new Socket("192.168.70.114",8888);
        // 2.获取流对象 . 输出流
        OutputStream out = socket.getOutputStream();
        // 3.写出数据.
        out.write("飞秋看片，指日可待".getBytes());
        //4.获取输入流
        InputStream in = socket.getInputStream();
        //5.读取数据并解析
        byte[] arr = new byte[8*1024];
        int len = in.read(arr);
        String mgs = new String(arr, 0, len);
        System.out.println("服务器回应："+mgs);
        //  关闭资源 
        out.close();
        socket.close();
    }
}
