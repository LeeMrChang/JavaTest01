package com.itheima._Demo02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
 * 可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
 */
public class ZuoYe_07 {
    public static void main(String[] args) throws IOException {
        //创建键盘录入
        Scanner sc = new Scanner(System.in);

        //创建字符输入流对象 Reader
        FileWriter wer = new FileWriter("Info.txt");
        //把输入的信息储存到Info.txt文件中
        while(true){
            System.out.println("请输入内容：");
            //获取输入的字符串
            String stu = sc.nextLine();
            //判断当输入的字符串为“886”时，程序停止
            if(stu.equals("886")){
                //循环结束
                break;
            }else{
                wer.write(stu);
                //换行操作
                wer.write(System.lineSeparator());
            }
        }



        //
        wer.close();

    }
}
