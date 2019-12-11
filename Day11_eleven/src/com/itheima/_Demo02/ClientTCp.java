package com.itheima._Demo02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 模拟客户端  【回写】
 */
public class ClientTCp {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端开启 准备发送数据");
        //1、创建客户端对象，指定服务的IP端口号
        Socket clinet = new Socket("192.168.70.114",6666);
        //2、写数据 需要输出流 由客户端对象提供，Socket.getOutputStream()
        OutputStream out = clinet.getOutputStream();
        //3、使用输出流，进行写数据
        out.write("Hello!MrFei!".getBytes());
        //4、使用Socket获取输入流对象
        InputStream in = clinet.getInputStream();
        //5、读取数据、解析数据
        byte[] buffer = new byte[1024];
        int len = in.read(buffer);

        String mgs = new String(buffer, 0, len);
        System.out.println("服务器回应："+mgs);
        //释放资源
        in.close();
        out.close();
        //关闭客户端
        clinet.close();
    }
}
