package com.itheima.Test_01;

import java.io.*;
import java.util.ArrayList;

/**
 * 现已存在book.txt文件：(需要在项目中创建一个book.txt文件，并将下列内容copy进去)
 * <p>
 * 其中内容为：
 * Java基础教程,55.00,12
 * 深入浅出JavaEE,53.00,34
 * MySQL使用指南,62.00,15
 * IOS从入门到精通,85.00,17
 * Java破天宝典,110.10,2
 * 需要完成最终效果，是在控制台完成如下信息打印：
 * Java基础教程,共计xxx元
 * 深入浅出JavaEE,共计xxx元
 * MySQL使用指南,共计xxx元
 * IOS从入门到精通,共计xxx元
 * Java破天宝典,共计xxx元
 * 图书总金额为:xxx元
 * 要求：
 * 1：定义一个图书类Book，要求有如下属性：图书名称、价格、数量。
 * 并完成对应构造以及geter与setter功能；
 * 2：在测试类中，定义集合ArrayList，并声明Book泛型，
 * 用到IO流读取book.txt文件将文本中每一行内容封装成Book对象并读取到集合中；
 * 3：程序启动，要求遍历集合,计算出每本书的总价,与所有书的总价打印到控制台
 */
public class demo {
    public static void main(String[] args) throws IOException {
        //定义ArrayList集合
        ArrayList<Book> list = new ArrayList<>();
        //创建带缓冲区的字符输入流对象，读取文件内容
        BufferedReader fos = new BufferedReader(new FileReader("Test_02\\book.txt"));
        //定义一个变量
        String line;
        //遍历读取文件内容
        while ((line = fos.readLine()) != null) {
            //得切割，先一整行转换成字符串数组
            String[] split = line.split(",");
            //split[0]代表图书名称，split[1]代表价格，split[2]代表数量
            String a = split[0];
            Double b = Double.parseDouble(split[1]);
            Integer c = Integer.parseInt(split[2]);
            //创建Book对象
            Book book = new Book(a, b, c);
            //将Book对象添加到list集合中
            list.add(book);
        }
        //程序启动，要求遍历集合,计算出每本书的总价,与所有书的总价打印到控制台
        //遍历list集合
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            //获取每一本图书图书的价格
            double price = list.get(i).getPrice();
            //获取每一款图书的数量
            int num = list.get(i).getNumber();
            //所有书的总价为
            double zong = price * num;
            sum+=zong;
            System.out.println(list.get(i).getName()+":"+zong);
        }
        System.out.println("所有书的总价为：" + sum);

        System.out.println("");
        //释放资源
        fos.close();
    }
}
