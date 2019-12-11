package com.itheima._Demo03;

import java.io.File;
import java.util.Scanner;

/**
 * 键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
 * 如果是文件，则输出文件的大小
 * 如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。
 */
public class ZuoYe_09 {

    public static void main(String[] args) {
        //创建键盘录入
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        //创建文件类对象，把录入的字符串传进去
        File flie = new File(f);
        //判断是文件夹还是文件夹
        if(flie.isFile()){
            System.out.println("如果是文件："+flie.length());
        }else{
            //是文件的话
            int num = 0;
            //转换成file类对象数组
            File[] dir = flie.listFiles();

            for (File file : dir) {
                if(file.isDirectory()){
                    num+=file.length();
                }
            }
            System.out.println("输出文件夹的总长度："+num);

        }














        //判断
        /*if(flie.isDirectory()){
            System.out.println("是文件，输出文件的大小："+f.length());
        }
        //获取文件夹大小之和,转换成文件对象数组
        File[] files = flie.listFiles();
        //再遍历
        //定义一个变量来计算文件夹总和
        int num = 0;
        for (int i = 0; i < files.length; i++) {
            num+=i;
        }


        System.out.println("文件夹的长度总和："+num);*/

    }
}
