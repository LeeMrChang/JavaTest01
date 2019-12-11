package com.itheima._Demo04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executors;

/**
 * 需求说明：使用TCP编写一个网络程序,设置服务器程序监听端口为8002,
 * 当于客户端建立后,向客户端发送”hello world”,客户端将信息输出
 */
public class ZuoYe_03 {
    public static void main(String[] args) throws IOException {
        //服务器
        System.out.println("服务器开启了");
        //1、创建服务器对象，并设置服务器程序监听端口为8002
        ServerSocket server = new ServerSocket(8002);
        while(true){
            //2、调用accpnt方法（），如连接上，返回客户端对象
            Socket socket = server.accept();
            //为每一个客户端创建一条新线程
           new Thread(()->{
               try{
                   //如连接上客户端，返回客户端对象
                   //因为上传的是文件，使用带缓冲区的字节输入流对象接收，并读取解析
                   BufferedInputStream fas = new BufferedInputStream(socket.getInputStream());
                   //同样使用带缓冲流的字节输出流对象接收客户端要上传文件，并写出
                   BufferedOutputStream fos = new BufferedOutputStream( new FileOutputStream("Day11_eleven\\Server\\"+System.currentTimeMillis()+".jpg"));
                   //读取并解析数据
                   byte[] buffer = new byte[1024];
                   int len ;
                   while((len=fas.read(buffer))!=-1){
                       fos.write(buffer,0,len);
                   }
                   //给服务器做个回应
                   OutputStream out = socket.getOutputStream();
                   out.write("文件上传成功！".getBytes());
                   //释放资源与关流
                   fos.close();
                   fas.close();
                   socket.close();
               }catch (Exception e){
                   e.addSuppressed(e);
               }

           }).start();

        }

    }
}
