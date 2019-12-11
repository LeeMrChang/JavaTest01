package com.itheima._Demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class demo06_collections2 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("c啊珂");
        list.add("d韩信");
        list.add("a孙悟空");
        list.add("b兰陵王");
        Collections.sort(list);
        System.out.println(list);
        Iterator<String> it = list.iterator();

        for(String s:list){
        System.out.println(s);
    }
    }
}
