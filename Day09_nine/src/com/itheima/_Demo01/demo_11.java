package com.itheima._Demo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用properties类解析文件
 */
public class demo_11 {

    public static void main(String[] args) throws IOException {
        //创建properties对象
        Properties por = new Properties();
        //读取配置中的文件信息
        por.load(new FileInputStream("Day09_nine\\db.properties"));

        System.out.println(por);

    }
}
