package com.itheima._Demo02;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。
        使用迭代器和增强for循环遍历LinkedHashSet。
        */
public class ZuoYe_04HashSet {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("王昭君");
        set.add("王昭君");
        set.add("西施");
        set.add("杨玉环");
        set.add("貂蝉");

        /*Iterator<String> it = set.iterator();

        while(it.hasNext()){
            String num = it.next();
            System.out.println(num);
        }*/

        for (String s : set) {
            System.out.println(s);
        }
    }
}
