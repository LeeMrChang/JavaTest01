package com.itheima._Demo06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02_Diedai {
    public static void main(String[] args) {
        //使用多态形式创建一个集合
        Collection<String> coll = new ArrayList<>();

        //添加元素到集合中去
        coll.add("傅红雪");
        coll.add("燕南飞");
        coll.add("明月");
        coll.add("杨无忌");
        coll.add("卓玉贞");
        System.out.println(coll);

        //使用迭代器遍历，每个对象都有属于自己的迭代器
        Iterator<String> it = coll.iterator();
        //判断是否有迭代元素，集合没有元素的话会报错
        while(it.hasNext()){
            String s =it.next();
            System.out.println(s);//有则输出
        }

    }
}
