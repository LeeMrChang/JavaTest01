package com.itheima._Demo02;

import java.util.*;

public class demo05_Collections {
    public static void main(String[] args) {
        //Arraylist对象
        ArrayList<Integer> list = new ArrayList<>();
        //添加元素
        list.add(23);
        list.add(34);
        list.add(35);
        list.add(24);
        System.out.println(list);
        //采用工具类，完成往集合中添加元素
        Collections.addAll(list,22,54,75,204);
        System.out.println(list);
        //排序法
        Collections.sort(list);
        System.out.println(list);

        //增强for遍历
        for(int num : list){
            System.out.println(num);
        }
        System.out.println("+++++++++++++++++++++++++");

        //迭达器遍历
        Iterator<Integer> ter = list.iterator();

        while(ter.hasNext()){
            int sum = ter.next();
            System.out.println(sum);
        }



    }
}
