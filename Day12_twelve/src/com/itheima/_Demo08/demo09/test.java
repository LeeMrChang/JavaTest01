package com.itheima._Demo08.demo09;

import java.util.function.Supplier;

public class test {
    public static void main(String[] args) {
        System.out.println(method(() -> "helllo!"));
    }
    public static String method(Supplier<String> lambda){
        return lambda.get();
    }
}
