package com.itheima._Demo03;

import java.io.File;

/**
 *描述:在D盘下创建一个名为ccc的文件夹，要求如下：
 * 1.ccc文件夹中要求包含bbb子文件夹
 * 2.bbb子文件夹要求包含aaa文件夹
 */
public class ZuoYe_04 {

    public static void main(String[] args) {
        //创建文件对象
        File file = new File("Day08_eight\\ccc\\bbb\\aaa");

        boolean mkdirs = file.mkdirs();


    }
}
