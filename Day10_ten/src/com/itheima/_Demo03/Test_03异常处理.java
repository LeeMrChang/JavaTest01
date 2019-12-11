package com.itheima._Demo03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_03异常处理 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = null;
        //创建字节输出流对象
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("Day10_ten\\aaa.txt");
            fos = new FileOutputStream("Day10_ten\\bbb.txt");
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } finally {
                if (fis != null) {
                    fis.close();
                }
            }
        }
    }


}
