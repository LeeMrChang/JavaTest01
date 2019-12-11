package com.itheima._Demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * 我有一个文本文件score.txt，我知道数据是键值对形式的，但是不知道内容是什么。
 * 请写一个程序判断是否有"lisi"这样的键存在，如果有就改变其实为"100"
 * score.txt文件内容如下：
 * zhangsan = 90
 * lisi = 80
 * wangwu = 85
 * 1.	创建一个空的Properties集合
 * 2.	读取数据到集合中
 * 3.	遍历集合，获取到每一个key
 * 4.	判断当前的key 是否为 "lisi"，如果是就把"lisi"的值设置为100
 * 5.	把集合中所有的信息，重新存储到文件中
 */
public class ZuoYe_08 {

    public static void main(String[] args) throws IOException {

        //创建属性集
        Properties pro = new Properties();
        //读取文件的内容
        pro.load(new FileInputStream("Day09_nine\\score.txt"));

        Set<String> keys = pro.stringPropertyNames();
        //遍历集合，获取每一个key
        for (String key : keys) {
            //判断是否有lisi这个键，有的话把lisi的值设置为100
            if(key.equals("lisi")){//判断是否含有lisi
                //有的话把lisi的值改为100
                pro.setProperty(key,"100");
            }
        }
        //
        pro.store(new FileOutputStream("score.txt"),"hello");

    }
}
