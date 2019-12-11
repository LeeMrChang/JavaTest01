package com.itheima._Demo01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输入流
 *   writer类
 */
public class demo_09 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        FileWriter wtr = new FileWriter("Day09_nine\\诗歌.txt");
        //输出方法
        wtr.write('鹅');
        wtr.write('鹅');
        wtr.write('鹅');
        //可以使用字符串输出
        wtr.write("\r\n");
        //也可以使用创建字符数组
        char[] cha = {'曲','项','向','天','歌'};
        wtr.write(cha);
        wtr.write("\r\n");
        wtr.write("小林今天剪光头了，很帅气");

        wtr.flush();//将数据从缓冲区刷新到文件中去

        //释放资源
        wtr.close();



    }
}
