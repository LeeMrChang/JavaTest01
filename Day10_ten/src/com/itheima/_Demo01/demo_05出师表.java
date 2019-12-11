package com.itheima._Demo01;
/**
 * 出师表
 */

import java.io.*;
import java.util.HashMap;

public class demo_05出师表 {
    public static void main(String[] args) throws IOException {
       //创建字符缓冲流对象
        BufferedReader fer = new BufferedReader(new FileReader("Day10_ten\\出师表.txt"));
        //因为一行有映射关系，使用map集合
        HashMap<Integer,String> map = new HashMap<>();
        //定义一个
        String line;
        //遍历
        while((line=fer.readLine())!=null){
            //需要分成映射关系，得切割，先一整行转换成字符串数组
            String[] split = line.split("\\.");
            //split[0]文字编号，split[1]代表文本文档内容
            map.put(Integer.parseInt(split[0]),split[1]);
        }
        //System.out.println(map);
        //释放资源

        //创建字符输出流对象，新得文件来接收内容
      BufferedWriter buf = new BufferedWriter(new FileWriter("Day10_ten\\新出师表.txt"));
        //需要解析原文本，因为总共有9行,键就是每行得数字编号
        for (int i = 1; i <=9 ; i++) {
            Integer key = i;
            //使用键获取值
            String value = map.get(key);
            //再写进新文件,值当表文本文档内容
            buf.write(key+"、"+value);
            //换行操作
            buf.newLine();
        }
        //关闭流
        fer.close();
        buf.close();



    }
}
