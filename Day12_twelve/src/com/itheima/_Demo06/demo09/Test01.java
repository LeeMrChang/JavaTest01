package com.itheima._Demo06.demo09;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.function.Supplier;

/**
 * 2.	分别使用lambda表达式获得以下对象：
 * a)	长度为5的String数组
 * b)	包含5个1-20(含1和20)之间随机数的HashSet<Integer>集合
 * c)	一个代表2018年4月1日的Calendar对象
 */
public class Test01 {
    public static <T> T getObj(Supplier<T> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        //获取长度为5的数组
        String[] obj = getObj(() -> new String[5]);
        //包含
       // ()->{return }
        HashSet<Integer> set = getObj(()->{
            Random r = new Random();
            HashSet<Integer> integers = new HashSet<>();
            for (int i = 0; i < 5; i++) {
                integers.add(r.nextInt(20)+1);
            }
            return integers;
        });
        //一个代表2018年4月1日的Calendar对象

        Calendar obj3 = getObj(()->{
            Calendar  calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, 2018);
            calendar.set(Calendar.MONTH, 3);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            return calendar;
        });

    }

}
