package com.itheima._Demo06;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;

public class Demo01_Collection {
    public static void main(String[] args) {
        //  创建集合对象，使用多态形式
        Collection<String> list = new ArrayList<>();//向上转型
        //将元素添加到集合中去
        list.add("李寻欢");
        list.add("叶开");
        list.add("公子羽");
        list.add("李坏");

        System.out.println(list);
        //判断集合中是否有这个元素
        System.out.println("判断李坏是否在集合中"+list.contains("李坏"));
        //删除在集合中得这个元素
        System.out.println("删除公子羽"+list.remove("公子羽"));
        System.out.println(list);

        //size(),查看集合的长度
        System.out.println(list.size());

        // Object[] toArray()转换成一个Object数组
        Object[] obj = list.toArray();
        //遍历数组
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        //clear  清空集合

        list.clear();
        System.out.println("集合中内容是否为:"+list);
        //验证是否为空
        System.out.println(list.isEmpty());

    }
}
