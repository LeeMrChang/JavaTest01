package com.itheima._Demo03;

import java.util.ArrayList;

/**
 * 八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，
 * 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
 */
public class Lianxi08 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);

        System.out.println("判断结果："+listTest(list,400));
    }

    public static int listTest(ArrayList<Integer> al, Integer str) {
        //要求返回s在al里面第一次出现的索引，如果s没出现过返回-1
        //遍历集合，获取元素，判断元素是否与s相等，相等返回索引
        for (Integer in : al) {
            //判断
            if (in == str) {
                return str;
            }
        }
        return -1;
    }
}
