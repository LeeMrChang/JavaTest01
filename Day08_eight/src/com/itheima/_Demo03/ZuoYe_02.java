package com.itheima._Demo03;

import java.io.File;
import java.io.IOException;

/**
 * 描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
 */
public class ZuoYe_02 {

    public static void main(String[] args) throws IOException {
        //创建文件对象：绝对路径
        File f = new File("D:\\a.txt");
        System.out.println(f.getAbsolutePath());

        if(!f.exists()){//判断此文件存不存在
            f.createNewFile();//创建新文件
        }
        System.out.println(f.exists());

        f.delete();//把刚创建的文件删除
        System.out.println(f.exists());//判断文件存在不
    }
}
