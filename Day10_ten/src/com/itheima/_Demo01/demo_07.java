package com.itheima._Demo01;

import java.io.*;

public class demo_07 {

    public static void main(String[] args) throws IOException {

        //创建字符流
        OutputStreamWriter wer = new OutputStreamWriter(new FileOutputStream("Day10_ten\\b.txt"),
                "GBK");
        //BufferedWriter wer = new BufferedWriter(new FileWriter("Day10_ten\\b.txt"));

        wer.write("我的热情就像那冬天里的一把火！");

        wer.close();
    }
}
