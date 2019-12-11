package com.itheima._Demo05;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动了......");
        //创建服务器对象
        ServerSocket server = new ServerSocket(8000);
        //调用accpnt方法（），建立连接
        Socket socket = server.accept();
        //转换流读取浏览器的请求信息
        BufferedReader fas = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String requst = fas.readLine();
        //取出请求资源的路径
        String[] strArr = requst.split(" ");
        //去掉web前面的/
        String path = strArr[1].substring(1);//获取得到的路径
        //读取客户端请求的资源文件
        FileInputStream file = new FileInputStream(path);
        byte[] buffer = new byte[1024];
        int len;
        //字节输出流，将文件写出客户端
        OutputStream out = socket.getOutputStream();
        //写入HTTP协议响应头，固定写法
        out.write("HTTP/1.1 200 OK\r\n".getBytes());
        out.write("Content-Type:test/heml\r\n".getBytes());
        //必须要写入空行，否则浏览器不解析
        out.write("\r\n".getBytes());
        while ((len = file.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }
        //
        file.close();
        out.close();
        fas.close();
        socket.close();
        server.close();


    }
}
