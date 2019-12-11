package com.itheima._Demo01;

import java.util.HashSet;

/**
 * 练习Set集合，Collection的子接口
 * 只能保证元素的唯一性，不能保证元素的存取顺序一致
 */
public class Practice_03 {

    public static void main(String[] args) {

        //创建Set集合对象
        HashSet<String> hash = new HashSet<>();

        //添加元素BO
        hash.add(new String("abc"));
        hash.add("cba");
        hash.add("cab");
        hash.add("abc");
        hash.add("bca");
        hash.add("ba");
        hash.add("bcLa");
        hash.add("bOa");
        hash.add("bOP");
        //hash.add("bOPa");

        System.out.println(hash.add("bOPa"));//true
        System.out.println("bOa".hashCode());//哈希值
        System.out.println("bca".hashCode());

        System.out.println("集合中的元素个数是：" + hash.size());


    }

    public static void print() {

    }
}

