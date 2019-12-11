package com.itheima._Demo01.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 数组当中有多条“姓名+性别”的信息如下，
 * 请通过 Predicate 接口的拼装将符合要求的字符串筛选到集合 ArrayList 中，需要同时满足两个条件
 * 1. 必须为女生； 2. 姓名为4个字
 */
public class Lianxi {
    public static void main(String[] args) {
            //创建一个字符串数组
        String[] array = {"沈浪尼玛,男","朱七七你,女","熊猫儿那,男","白飞飞尼,女"};
        //判断条件，切割，在拼接       //判断性别一致为女
        List<String> list = method(array,s ->"女".equals(s.split(",")[1]),
                s ->s.split(",")[0].length()==4);//判断名字长度为4
        System.out.println(list);
    }

    private static List<String> method(String[] arr,Predicate<String> one,Predicate<String> two){
        //创建list集合来接收字符串数组
        List<String> list = new ArrayList<>();
        //遍历list集合
        for (String s : arr) {
            //字符串
            if(one.and(two).test(s)){
                list.add(s);
            }
        }
            return list;
    }
}
