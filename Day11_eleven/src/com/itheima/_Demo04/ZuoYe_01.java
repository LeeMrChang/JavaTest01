package com.itheima._Demo04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 需求说明：创建新项目，按以下要求编写代码：
 * 在项目下创建TCP 服务器端 端口号为8888
 * 1:等待客户端连接   如果有客户端连接  获取到客户端对象
 * 2:获取到客户端对象之后 当前在服务器读取数据客户端传送数据
 */
public class ZuoYe_01 {

    public static void main(String[] args) throws IOException {
        System.out.println("服务器开启");

        //1、创建服务器对象
        ServerSocket server = new ServerSocket(8888);
        while(true){
            //2、调用accpnt（）方法，并绑定端口号，如有客户端连接，获取客户端对象
            Socket socket = server.accept();
            new Thread(
                    ()->{
                        try{
                            //3、用客户端对象创建输入流，读取客户端发送过来的数据
                            InputStream in = socket.getInputStream();
                            //4、读取并解析数据
                            byte[] buffer = new byte[1024];
                            int len = in.read(buffer);
                            String mgs = new String(buffer, 0, len);
                            System.out.println("客户端说："+mgs);
                            //5、获取输出流对象，并回写信息给予客户端
                            OutputStream out = socket.getOutputStream();
                            //6、写出数据，回应客户端
                            out.write("吃什么早餐，叫它吃屎吧！".getBytes());
                            //
                            out.close();
                            in.close();
                            socket.close();
                        }catch (Exception e){
                            e.addSuppressed(e);
                        }
                    }
            ).start();
        }
    }
}
