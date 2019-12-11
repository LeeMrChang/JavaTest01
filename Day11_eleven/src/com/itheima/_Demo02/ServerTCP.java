package com.itheima._Demo02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 模拟服务器端 【回写】
 */
public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器端启动  等待连接.....");
        //1、创建服务器端对象，绑定端口
        ServerSocket server  = new ServerSocket(6666);
        //2、调用accpent()方法，等待客户连接，阻塞  等待
        //3、如果连接上了  那么这个方法返回的就是 Socket 的对象（也就是客户端对象）
        Socket socket = server.accept();
        //4、需要将流中的数据读过来，需要客户端对象提供输入流  Socket.getInputStream()
        InputStream in = socket.getInputStream();
        //5、读取流中的数据
        byte[] buffer = new byte[1024];
        // 读取数据
        int len = in.read(buffer);
        //解析数据
        String mgs = new String(buffer, 0, len);
        System.out.println("客户端说："+mgs);
        //6、通过Socket获取输出流
        OutputStream out = socket.getOutputStream();
        //7、回写数据
        out.write("小林说肚子痛要拉🔟".getBytes());

        //释放资源
        out.close();
        in.close();
        //关闭客户端
        socket.close();
    }
}
