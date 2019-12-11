package com.itheima._Demo02;

import java.util.HashSet;

public class demo03_Set {
    public static void main(String[] args) {
        //创建Set集合
        HashSet<String>  ha = new HashSet<String>();
        //添加元素
        ha.add("庄周");
        ha.add("百里玄策");
        ha.add("盾山");
        ha.add(new String("花木兰"));
        System.out.println(ha);
        //遍历元素
        String str = new String("花木兰");
        System.out.println(str);
        for(String s : ha){
            System.out.println(s);
        }

    }
}
