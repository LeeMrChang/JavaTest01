package com.itheima._Demo01;

import java.util.ArrayList;

/*
定义一个方法listTest(ArrayList<String> al),
        要求使用isEmpty()判断al里面是否有元素。
        */
public class ZuoYe_05 {

    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("达摩");
        list.add("凯");
        list.add("典韦");
        list.add("白起");
        //清空
        list.clear();
        System.out.println(listTest(list));
    }

    public static boolean listTest(ArrayList<String> al){

        boolean emp = al.isEmpty();

        return emp;
    }
}
