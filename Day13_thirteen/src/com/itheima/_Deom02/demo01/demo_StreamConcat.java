package com.itheima._Deom02.demo01;

import java.util.stream.Stream;

/**
 * concat组合方法
 * 如果有两个流，希望合并成为一个流，那么可以使用 Stream 接口的静态方法 concat ：
 */
public class demo_StreamConcat {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张无忌");

        Stream<String> stream1 = Stream.of("赵敏");
//      这个是合并出来的流
        Stream<String> concat = Stream.concat(stream, stream1);

    }
}
