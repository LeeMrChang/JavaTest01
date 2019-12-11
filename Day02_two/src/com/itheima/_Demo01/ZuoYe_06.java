package com.itheima._Demo01;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
定义一个方法listTest(ArrayList<Integer> al, Integer s)，
        要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
     indexOf 返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。
        */
public class ZuoYe_06 {

    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //添加元素
        list.add(123);
        list.add(200);
        list.add(150);
        list.add(200);
        System.out.println(listTest(list,200));

    }
    public static int listTest(ArrayList<Integer> al,Integer s){

        int i = al.indexOf(s);

        return i;
    }
}
