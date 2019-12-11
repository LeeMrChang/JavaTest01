package com.itheima._Demo08;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * B/S  模拟网站服务器
 */
public class ServerBs {
    public static void main(String[] args)throws IOException {
        // 创建服务器
        ServerSocket ser = new ServerSocket(9999);
        while(true){
            System.out.println("服务器连接中");
            Socket socket = ser.accept();
            System.out.println("服务器已连接");
            //创建网站服务器线程
            new Thread(()->{
                //try出所有异常
                try{
                    // 获取和浏览器连接的输入流
                    InputStream in = socket.getInputStream();
                    // 需要将字节流, 转换成BufferedReader
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    // 读取一行
                    String s = br.readLine();
                    // 通过空格分割
                    String[] arr = s.split(" ");
                    // 获取第二个元素, 并去掉第一个字符，获取路径
                    String path = arr[1].substring(1);
                    // 创建和文件连接的输入流
                    BufferedInputStream fas = new BufferedInputStream(new FileInputStream(path));
                    // 获取和浏览器连接的输出流
                    BufferedOutputStream fos = new BufferedOutputStream(socket.getOutputStream());
                    // 写入HTTP协议响应头,固定写法
                    fos.write("HTTP/1.1 200 OK\r\n".getBytes());
                    fos.write("Content-Type:text/html\r\n".getBytes());
                    // 必须要写入空行,否则浏览器不解析
                    fos.write("\r\n".getBytes());
                    // 写出
                    int b;
                    while ((b=fas.read())!=-1){
                            fos.write(b);
                    }
                    // 释放资源
                    fos.close();
                    fas.close();
                    br.close();
                    in.close();
                    socket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }).start();
        }


    }
}
