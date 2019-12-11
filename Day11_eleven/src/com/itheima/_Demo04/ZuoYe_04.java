package com.itheima._Demo04;

import java.io.*;
import java.net.Socket;

/**
 * 需求说明：我们来做一个“文件上传案例”，有以下要求：
 * 将项目中的一个图片,通过客户端上传至服务器
 * 要求判断文件是否存在及格式是否为jpg并要求文件小于2M
 */
public class ZuoYe_04 {
    public static void main(String[] args) throws IOException {
        //1、创建客户端执行对象，并指定IP地址与端口号
        Socket socket = new Socket("192.168.70.114",8002);
        //2、创建字节输入流，用来获取关联文件上的文件信息
        File file = new File("Day11_eleven\\Cilent\\test.jpg");
        if(!file.exists()){
            System.out.println("此文件规格太大上传不了");
            return;
        }
        if(!file.getName().endsWith("jpg")&&file.length()<1024*1024*2){
            System.out.println("此文件规格太大上传不了");
                return;
        }
        FileInputStream fas = new FileInputStream(file);
        //4、根据客户端对象，创建输出流对象，
        OutputStream out = socket.getOutputStream();
        //3、读取并解析文件信息
        byte[] buffer = new byte[1024];
        int len;
        while((len=fas.read(buffer))!=-1){
            //写出内容
                out.write(buffer,0,len);
        }
        //5、写出数据发送给予服务器端，必须通知服务器，客户端已完成发送内容且停止写出了
        socket.shutdownOutput();
        System.out.println("文件上传中!");

        //6、接收到服务器的回应，根据客户端对象创建输入流对象
        InputStream in = socket.getInputStream();
        //读取并解析服务端内容
        byte[] bytes = new byte[1024];
        int line = in.read(bytes);
        String mgs = new String(bytes, 0, line);
        System.out.println("服务器回应："+mgs);

        //关流并释放资源
        in.close();
        //out.close();
        fas.close();
        socket.close();
    }
}
