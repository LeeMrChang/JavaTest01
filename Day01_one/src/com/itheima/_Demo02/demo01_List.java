package com.itheima._Demo02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo01_List {
    public static void main(String[] args) {

        //创建list集合对象
        List<String> list = new ArrayList<String>();
        //往尾部添加指定元素
        list.add("陆小凤");
        list.add("西门吹雪");
        list.add("花满楼");
        list.add("叶孤城");
        System.out.println(list);

        //删除指定位置的元素
        System.out.println("删除指定位置为3 的元素：" + list.remove(3));
        System.out.println(list);

        //在指定位置进行元素修改（替代）
        list.set(2, "楚留香");
        System.out.println(list);

        //遍历集合，打印输出元素,用迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String stu = it.next();
            System.out.println(stu);
        }
        System.out.println("=======================");
        //使用增强for遍历
        for (String s : list) {
            System.out.println(s);
        }


    }
}
