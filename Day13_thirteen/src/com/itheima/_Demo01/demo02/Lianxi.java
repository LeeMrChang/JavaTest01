package com.itheima._Demo01.demo02;

import java.util.function.Function;

/**
 * 请使用 Function 进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
 * 1. 将字符串截取数字年龄部分，得到字符串；
 * 2. 将上一步的字符串转换成为int类型的数字；
 * 3. 将上一步的int数字累加100，得到结果int数字
 */
public class Lianxi {
    public static void main(String[] args) {

        String str  = "林小旭,30";
        int age = method(str,s ->s.split(",")[1],Integer::parseInt,s->s+=100);
        System.out.println(age);
    }
    public static int method(String str,Function<String,String> one,Function<String,Integer> two,
                              Function<Integer,Integer> three){

        return one.andThen(two).andThen(three).apply(str);
    }
}
