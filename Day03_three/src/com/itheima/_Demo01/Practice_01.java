package com.itheima._Demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * List,集合，有序、有索引、有重复元素
 *
 *   Collection的子接口
 */
public class Practice_01 {

    public static void main(String[] args) {

        //创建List集合
        List<String> list = new ArrayList<>();
        //添加元素
        list.add("廉颇");
        list.add("刘禅");
        list.add("张飞");
        list.add("太乙真人");
        list.add("鲁班");
        //指定索引位置添加新的元素  list.add
        list.add(4, "东皇太一");
        System.out.println(list);
        //删除，删除指定索引位置的元素  list.remove
        String remove = list.remove(5);
        System.out.println(remove);
        System.out.println(list);
        //在指定索引的位置替换新元素  list.set
        list.set(2,"孙尚香");
        System.out.println(list);
        //获取指定索引位置的元素  list.get
        String s = list.get(3);
        System.out.println(s);
        //遍历list
        /*for (String str : list) {
            System.out.println(str);
        }*/

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
