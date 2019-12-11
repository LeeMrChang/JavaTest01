package com.itheima._Demo01;

import java.io.*;

public class demo_04新换行方式 {

    public static void main(String[] args) {

        try (
                //创建字符输出缓冲流对象
                BufferedWriter wer = new BufferedWriter(new FileWriter("Day10_ten\\nba.txt"));
        ) {
            wer.write("詹姆斯");
            wer.newLine();//换行新方式
            wer.write("威斯布鲁克");
            wer.newLine();
            wer.write("詹姆斯-哈登");
            wer.newLine();
            wer.write("凯文-杜兰特");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
