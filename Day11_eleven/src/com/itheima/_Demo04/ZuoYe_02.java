package com.itheima._Demo04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 在项目下创建TCP 客户端
 * 访问之前创建的服务器端,服务器端ip127.0.0.1 端口号8888
 * 1:客户端连接服务器,并发送 hello.服务器,我是客户端.
 * 2:开启上一题服务器,等待客户端连接,客户端连接并发送数据
 */
public class ZuoYe_02 {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端发送数据");
        //1、创建客户端对象，并指定IP地址与端口号
        Socket socket = new Socket("",8888);
        //2、直接写数据,使用客户端对象获取输出流
        OutputStream out = socket.getOutputStream();
        //3、写数据
        out.write("小林现在才在吃早餐！".getBytes());
        //4、获取到服务器的回应，创建输入流对象
        InputStream in = socket.getInputStream();
        //5、读取数据并解析数据
        byte[] buffer = new byte[1024];
        int len = in.read(buffer);
        String mgs = new String(buffer, 0, len);
        System.out.println("服务器回应："+mgs);

        //释放资源
        in.close();
        out.close();
        socket.close();
    }
}
