package com.itheima._Demo02;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**描述:从键盘录入一行字符串，利用字节打印流将该行字符串保存到当前项目根目录下的d.txt文件中
 *
 */
public class ZuoYe_09 {
    public static void main(String[] args) throws IOException {
        //键盘录入一行字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String line = sc.next();
        //使用字节打印流将该
        //创建字节打印流,指定文件名称
        PrintStream stu = new PrintStream("Day10_ten\\d.txt");
        //设置系统的打印流流向，输出到d.txt
        stu.println(line);

        stu.close();




    }
}
