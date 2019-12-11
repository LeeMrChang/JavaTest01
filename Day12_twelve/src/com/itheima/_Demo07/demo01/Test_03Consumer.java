package com.itheima._Demo07.demo01;

import java.util.function.Consumer;

/**
 * Consumer 接口中包含抽象方法 void accept(T t) ，意为消费一个指定泛型的数据。
 */
public class Test_03Consumer {
    public static void main(String[] args) {

        consumerString(s-> System.out.println(s));
        consumerString(System.out::println);
    }

    private static void consumerString(Consumer<String> function){

        function.accept("林俊旭迟到了！");

    }

}
