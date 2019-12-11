package com.itheima._Demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class KuHuDuan {
    public static void main(String[] args) throws IOException {

        System.out.println("客户端发送数！");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要发送的内容！");
            String line = sc.nextLine();
            //创建客户端对象，并指定IP地址与端口号
            Socket client = new Socket("192.168.70.70", 8888);
            //写数据，需要获取输出流对象，
            OutputStream out = client.getOutputStream();
            //写数据
            out.write(line.getBytes());
            //接收到服务端的信息，获取输入流
            InputStream in = client.getInputStream();
            //读取数据并解析数据
            byte[] buffer = new byte[1024];
            int len = in.read(buffer);
            String mgs = new String(buffer, 0, len);
            System.out.println("费小奇：" + mgs);
            //
            in.close();
            //关闭流
            out.close();
            //关闭客户端
            client.close();
        }


    }
}
