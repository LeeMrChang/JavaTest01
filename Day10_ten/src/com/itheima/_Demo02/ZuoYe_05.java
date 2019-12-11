package com.itheima._Demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *描述:现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。
 * 要求：使用gbk编码保存。
 * 注意：idea的默认编码是utf-8,所以可以通过filesettingsfile encodings设置为gbk格式，
 * 否则打开a.txt文件看到的将会是乱码。
 */
public class ZuoYe_05 {
    public static void main(String[] args) throws IOException {
        //创建字符串转换输出流
        OutputStreamWriter fos = new OutputStreamWriter(new FileOutputStream("Day10_ten\\b.txt"),
                "gbk");
        //输出
        fos.write("我爱Java！");

        fos.close();

    }
}
