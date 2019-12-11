package com.itheima._Demo03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test_04Properties {
    public static void main(String[] args)throws IOException {
        //创建Propertiesdu对象
        Properties po = new Properties();
        //创建字节输入流，输入流关联配置文件
       // FileInputStream fis = new FileInputStream("Day10_ten\\aaa.txt");
        InputStream fis = Test_04Properties.class.getClassLoader().getResourceAsStream("ccc.properties");
        //读取配置文件
        po.load(fis);
        //关流
        po.clear();
        String id = po.getProperty("id");
        String name = po.getProperty("name");
        System.out.println(id+"==="+name);
    }


}
