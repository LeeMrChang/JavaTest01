package com.itheima._Demo02;

import java.util.ArrayList;
import java.util.Collection;

public class Test01 {

    public static void main(String[] args) {


        Collection<String> coll = new ArrayList<>();

        coll.add("郭靖");
        coll.add("杨康");
        coll.add("黄蓉");
        coll.add("慕容慈");

        // System.out.println(coll);

        //清空
        //coll.clear();

        //删除
        //coll.remove("杨康");
        System.out.println( coll.remove("杨康"));

        //contains判断集合内是否包含这个对象
        /*boolean mu = coll.contains("慕容慈");
        System.out.println(mu);*/

        //判断集合是否为空
       /* boolean empty = coll.isEmpty();
        System.out.println(empty);*/

       //返回集合中元素的个数
       /* int size = coll.size();
        System.out.println(size);*/

       //toArray,集合转数组
       /* Object[] obj = coll.toArray();

        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }*/


    }
}

