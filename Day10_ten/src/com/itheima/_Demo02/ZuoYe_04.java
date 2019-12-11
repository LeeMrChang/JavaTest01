package com.itheima._Demo02;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 描述:
 * 分析以下需求，并用代码实现
 * 实现一个验证码小程序，要求如下：
 * 1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，
 * 要求一个验证码占一行；
 * 2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，
 * 如果不存在控制台提示验证失败
 */
public class ZuoYe_04 {
    public static void main(String[] args) throws IOException {
        //需要录入验证码，创建键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入3个字符串验证码:");
        //需要新建文件与验证码需要换行，使用高效字符输出流
        BufferedWriter fws = new BufferedWriter(new FileWriter("Day10_ten\\a.txt"));
        //创建高效字符输入流  用来读取文件内容
        BufferedReader fas = new BufferedReader(new FileReader("Day10_ten\\a.txt"));
        //创建一个集合，来接收文件内容并可进行验证判断
        ArrayList<String> list = new ArrayList<>();
        //录入的师3个字符串，需要判断
        for (int i = 1; i <= 3; i++) {
            String str = sc.next();
            fws.write(str);
            fws.newLine();
        }
        fws.close();
        //读取文件内容
        String line;
        while((line=fas.readLine())!=null){
            list.add(line);
        }
        //创建验证码
        System.out.println("验证码：");
        String num = sc.next();
        //进行比判断
        if(list.contains(num)){
            System.out.println("验证成功");
        }else{
            System.out.println("验证失败");
        }

        fas.close();
        //关闭输入流

    }
}
