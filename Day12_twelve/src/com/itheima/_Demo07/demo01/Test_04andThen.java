package com.itheima._Demo07.demo01;

import java.util.function.Consumer;

/**
 * 如果一个方法的参数和返回值全都是 Consumer 类型，那么就可以实现效果：
 * 消费一个数据的时候，首先做一个操 作，然后再做一个操作，实现组合。
 * 而这个方法就是 Consumer 接口中的default方法 andThen
 */
public class Test_04andThen {
    public static void main(String[] args) {

        consumerString(s -> System.out.println(s.toUpperCase()),
                s -> System.out.println(s.toLowerCase()));
    }
    private static void consumerString(Consumer<String> one,Consumer<String> two ){

        one.andThen(two).accept("hello");
    }
}
