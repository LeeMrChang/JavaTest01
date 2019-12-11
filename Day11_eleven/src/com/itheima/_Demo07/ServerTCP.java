package com.itheima._Demo07;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现客户端向服务器上传文件
 */
public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端开启了....等待连接....");
        // 1. 创建服务端ServerSocket
        ServerSocket ser = new ServerSocket(6666);
        //服务器循环，可接收多线程客户端
        while(true){
            // 2. 在确定连接建立的情况下，方可开启每一条客户端线程
            Socket ket = ser.accept();
            new Thread(()->{
                //tyr所有异常
                try{
                    // 3. 创建带缓冲流对象，因为上传的是文件，带缓冲区效率更高
                    //  3.1 获取输入流,读取文件数据
                    BufferedInputStream fas = new BufferedInputStream(ket.getInputStream());
                    // 3.2 创建输出流,保存到本地
                    BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("Day11_eleven\\Server\\"+System.currentTimeMillis()+".jpg"));

                    System.out.println("传输中。。。");
                    byte[] arr = new byte[1024*8];
                    int len;
                    while((len=fas.read(arr))!=-1){
                        // 4. 读写数据
                        fos.write(arr,0,len);
                    }


                    System.out.println("文件上传成功！");
                    //回写
                    OutputStream out = ket.getOutputStream();
                    out.write("传输成功！".getBytes());

                    //5. 关闭 资源
                    out.close();
                    fos.close();
                    fas.close();
                    ket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }).start();

        }

    }
}
