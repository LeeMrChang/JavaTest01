package com.itheima._Demo03;

import java.io.File;

/**
 *描述:在D盘下创建一个名为bbb的文件夹。
 */
public class ZuoYe_03 {
    public static void main(String[] args) {
        //创建文件对象
        File file = new File("Day08_eight\\bbb\\ccc\\vvv");
        System.out.println(file.getAbsolutePath());
        //创建新的文件夹
        file.mkdirs();

        //遍历删除
        File[] files = file.listFiles();//将文件象元素一样存到数组里面
        for (File dir : files) {
            if(dir.isDirectory()){

            }
        }

        file.delete();
    }
}
