package com.itheima._Demo01.demo01;

import java.util.function.Predicate;

public class demo_Predicate {

    public static void main(String[] args) {
        method(s -> s.length()>5);//lambda写入一个判断条件
    }
    private static void method(Predicate<String> predicate){
        //判断字符串的长度
        boolean verylong = predicate.test("Hello Java!");

        System.out.println("字符串的长度为："+verylong);//返回一个布尔值
    }
}
