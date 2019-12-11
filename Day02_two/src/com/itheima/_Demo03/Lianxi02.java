package com.itheima._Demo03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 二、给定以下代码，请定义方法listTest()统计集合中指定元素出现的次数，
 * 如"a": 2,"b": 2,"c" :1, "xxx":0。
 */
public class Lianxi02 {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");

        System.out.println("a出现的次数为："+listTest(list,"a"));
        System.out.println("b出现的次数为："+listTest(list,"b"));
        System.out.println("c出现的次数为："+listTest(list,"c"));


    }

    /**
     *
     * @param list
     * @param s
     * @return
     */
    public static int listTest(Collection<String> list,String s){
            //1、定义一个计数器
        int count = 0;
        //2、增强for遍历
        for (String str : list) {
            //3、判断传入的方法的字符与遍历的集合是否一致
            if(s.equals(str)){
                //如果一致则count++
                count++;
            }
        }
        return count;

    }
}
