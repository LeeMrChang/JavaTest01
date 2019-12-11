package com.itheima._Deom02.demo01;

import java.util.stream.Stream;

/**
 * Iimit 取前几个的方法
 */
public class demo_StreamIimit {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张翠山", "张无忌", "周芷若");
//      如果把上面的几个字符串看成字符串数组，Iimit方法则是把此数组的请几个元素提取出来
        stream.limit(1).forEach(System.out::println);
    }
}
