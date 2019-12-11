package com.itheima._Deom02.demo01;

import java.util.stream.Stream;

/**
 * 复习Function接口
 *这可以将一种T类型转换成为R类型，而这种转换的动作，就称为“映射”。
 */
public class demo_StreamFunction {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("10", "20", "30");
//       map 方法的参数通过方法引用，将字符串类型转换成为了int类型（并自动装箱为 Integer 类对 象）。
        Stream<Integer> intter = stream.map(Integer::parseInt);
    }
}
