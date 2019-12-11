package com.itheima._Demo03;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 模拟服务器接收客户端上传的文件
 */
public class File_Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动了......");
        //1、创建服务器端对象，并绑定端口号
        ServerSocket server = new ServerSocket(8888);
        while (true) {
            //2、调用accpnt（）方法，建立连接
            Socket accept = server.accept();
            //需要接收到客户端连接之后，才可以给每一个客户端开一个新线程
            new Thread(
                    () -> {
                        try {
                            //3.1使用带缓冲区流对象，根据客户端对象获取输入流
                            BufferedInputStream fas = new BufferedInputStream(accept.getInputStream());
                            //3.2创建带缓冲区输出流对象，将文件保存到本地硬盘
                            BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("Day11_eleven\\Server\\" + System.currentTimeMillis() + ".jpg"));
                            //4、解析数据
                            byte[] buffer = new byte[1024];
                            int len;
                            while ((len = fas.read(buffer)) != -1) {
                                //写出数据
                                fos.write(buffer, 0, len);
                            }
                            //回写数据
                            OutputStream out = accept.getOutputStream();
                            //写出
                            out.write("数据上传！".getBytes());
                            //释放资源
                            out.close();
                            fos.close();
                            fas.close();
                        } catch (IOException e) {
                            e.addSuppressed(e);
                        }
                    }
            ).start();


        }
    }
}
