package com.itheima._Demo03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 六、定义一个方法listTest(ArrayList<String> al),
 * 要求使用isEmpty()判断al里面是否有元素。
 */
public class Lianxi06 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(listTest(list));

    }

    public static boolean listTest(ArrayList<String> al) {
        //使用迭代器遍历并判断是否有元素

        while (al.isEmpty()) {
            return true;
        }
        return false;

    }
}
