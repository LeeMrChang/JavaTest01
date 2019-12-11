package com.itheima._Demo07.demo01;

import java.util.function.Supplier;

/**
 * Supplier接口
 */
public class Test_01 {
    public static void main(String[] args) {

        String mgaA = "Hello";
        String mgaB = "Word";

        System.out.println(getString(()->mgaA+mgaB));

    }

    public  static  String getString(Supplier<String> function){

        return function.get();
    }
}
