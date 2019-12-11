package com.itheima._Demo01;

import java.io.*;

public class demo_06 {

    public static void main(String[] args) throws IOException {
        //转换流中的字符输入流
        InputStreamReader fas = new InputStreamReader(new FileInputStream
                ("D:\\a.txt"),"GBk");
        int len;
        while((len=fas.read())!=-1){
            System.out.println((char)len);
        }

        fas.close();
    }
}
