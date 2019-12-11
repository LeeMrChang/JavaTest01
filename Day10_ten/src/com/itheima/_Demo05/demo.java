package com.itheima._Demo05;

import java.io.*;
import java.util.ArrayList;

/**
 * 序列化
 */
public class demo {
    public static void main(String[] args)throws IOException {
        //对象字节输出转换流
        ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("Day10_ten\\qqq.txt"));
        //创建游戏对象
        Role ro = new Role("小林","大宝剑",13,12,14);
        Role ri = new Role("小狗","小宝剑",13,12,14);
        Role rb = new Role("小黄","冲锋枪",13,12,14);
        //创建集合，并添加到集合
        ArrayList<Role> list = new ArrayList<>();
        list.add(ro);
        list.add(ri);
        list.add(rb);

        fos.writeObject(list);

        fos.close();
    }
    public static void print() throws IOException, ClassNotFoundException {
        // 对象输入流
      ObjectInputStream fis = new ObjectInputStream(new FileInputStream("Day10_ten\\qqq.txt"));
        // 读取
        ArrayList<Role> fit  = (ArrayList<Role>) fis.readObject();
        // 遍历打印
        for (Role role : fit) {
            System.out.println(role);
        }
        // 关流
       fit.clear();
    }
}
