package com.itheima._Demo01;

import java.util.ArrayList;
import java.util.Random;

/*
十、产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，
        并打印到控制台。
        */
public class ZuoYe_08 {

    public static void main(String[] args) {

        //创建一个集合
        ArrayList<Integer> list = new ArrayList<>();

        //创建随机数、
        Random r = new Random();
        System.out.println("生成10个的1-100之间的随机数：");

        for (int i = 0; i < 10; i++) {
            //
            int num = r.nextInt(100)+1;
            if(num>=10){
                list.add(num);
            }
        }
        System.out.println(list);
    }
}
