package com.itheima._Demo03.demo01;

import java.util.stream.Stream;

/*8
有如下整数1，-2，-3，4，-5
使用Stream取元素绝对值并打印

 */
public class Test_05 {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);

        stream.map(Math::abs).forEach(System.out::println);


    }

}