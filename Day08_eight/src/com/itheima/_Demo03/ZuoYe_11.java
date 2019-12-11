package com.itheima._Demo03;

import java.io.File;
import java.util.Scanner;

/**
 * 键盘录入一个文件夹路径，删除该文件夹以及文件夹路径下的所有文件。
 * 要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
 * 提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。
 */
public class ZuoYe_11 {

    public static void main(String[] args) {
        //创建键盘录入
        Scanner sc = new Scanner(System.in);
        String stu = sc.nextLine();
        //创建File类对象
        File f = new File(stu);
        //获取文件夹里所有文件
        File[] fi = f.listFiles();
        //遍历
        for (File file : fi) {
            file.delete();
        }

    }
}
