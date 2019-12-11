package com.itheima._Demo02;

//向list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫。

import java.util.ArrayList;

public class ZuoYe_03 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");

        list.set(3, "王小丫");
        System.out.println(list);
    }
}
