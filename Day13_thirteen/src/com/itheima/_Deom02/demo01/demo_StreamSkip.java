package com.itheima._Deom02.demo01;

import java.util.stream.Stream;

/**
 * Skip 跳过前几个的方法
 */
public class demo_StreamSkip {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张翠山", "张无忌", "周芷若");
//字符串数组，，skip方法是
        stream.skip(2).forEach(System.out::println);
    }
}
