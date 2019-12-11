package com.itheima._Demo04;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //创建一个群主
        QunZhu qz = new QunZhu("公子羽",200);

        //
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要发的红包金额：");
        int red = sc.nextInt();
        System.out.println("请输入您要发的红包次数：");
        int count = sc.nextInt();

        //发送红包
        ArrayList<Double> sendList = qz.send(red,count);

        //创建3个成员对象
        Menber m1 = new Menber("明月",0);
        Menber m2 = new Menber("燕南飞",0);
        Menber m3 = new Menber("傅红雪",0);

        //打开红包
        m1.openRedBag(sendList);
        m2.openRedBag(sendList);
        m3.openRedBag(sendList);
        //
        qz.show();
        m1.show();
        m2.show();
        m3.show();




    }
}
