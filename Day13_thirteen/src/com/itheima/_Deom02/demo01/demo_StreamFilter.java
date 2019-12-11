package com.itheima._Deom02.demo01;

import java.util.stream.Stream;

/**
 * 常用的Stream方法：filter() 过滤法
 *
 */
public class demo_StreamFilter {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张翠山", "张无忌", "周芷若");

        Stream<String> zhou = stream.filter(s -> s.startsWith("周"));
        //count 统计次数
       // System.out.println(zhou.count());
        zhou.forEach(System.out::println);


    }
}
