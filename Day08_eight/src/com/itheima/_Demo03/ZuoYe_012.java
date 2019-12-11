package com.itheima._Demo03;

import java.io.File;
import java.util.Scanner;

/**
 * 1.	创建键盘录入对象Scanner
 * 2.	定义字符串接收用户输入的文件夹路径
 * 3.	根据文件夹路径创建文件对象
 * 4.	定义一个方法calculate用来计算指定文件夹的大小，接收文件参数，
 * 返回long类型数值表示文件夹的大小。
 * 5.	调用calculate方法传入文件夹对象，在该方法内部获得文件夹中所有文件，
 * 得到一个文件数组，定义一个变量size累加每一个文件的大小，遍历文件数组，判断是否是文件，
 * 如果是文件则获得文件大小并累加到变量size中，如果是文件夹，继续递归调用当前方法。
 */
public class ZuoYe_012 {

    public static void main(String[] args) {
        //创建键盘录入、
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String stu  = sc.nextLine();
        //创建文件对象
        File f = new File(stu);
        long cal = calculate(f);
        System.out.println("文件总大小："+cal);

    }

    /**
     * 定义一个方法calculate用来计算指定文件夹的大小，接收文件参数，
     * *       返回long类型数值表示文件夹的大小。
     */
    public static long calculate(File dir) {
        //定义一个变量计算文件的大小
        long length = 0;
        // 获取文件数组
        File[] files = dir.listFiles();
        //遍历数组
        for (File file : files) {
            //判断是否是文件
            if (file.isFile()) {
                length += file.length();
            } else {
                length += calculate(file);
            }
        }
        return length;

    }
}
