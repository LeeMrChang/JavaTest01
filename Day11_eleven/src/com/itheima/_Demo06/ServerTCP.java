package com.itheima._Demo06;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端向服务端发送数据
 */
public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端开始发送数据！");
        // 1.创建 ServerSocket对象，绑定端口，开始等待连接
        ServerSocket server = new ServerSocket(8888);
        // 2.接收连接 accept 方法, 返回 socket 对象.
        Socket socket = server.accept();
        // 3.通过socket 获取输入流
        InputStream in = socket.getInputStream();
        // 4.一次性读取数据
        //in.readAllBytes();
        // 4.1 创建字节数组
        byte[] arr = new byte[1024*8];
        // 4.3 解析数组,打印字符串信息
        int len = in.read(arr);
        String mgs = new String(arr, 0, len);
        System.out.println("客户端说："+mgs);
        //==================回写数据================
        //4.4通过socket获取输出流对象
        OutputStream out = socket.getOutputStream();
        //写出数据
        out.write("看尼玛的！好好敲代码！".getBytes());
        //5.关闭资源.
        in.close();
        socket.close();
    }
}
