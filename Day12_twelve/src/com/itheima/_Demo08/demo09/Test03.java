package com.itheima._Demo08.demo09;

import java.util.function.Consumer;

public class Test03 {

    private static void method( String name,Consumer<String> lambda){
            lambda.accept(name);
    }

    public static void main(String[] args) {


        String name = "kobi";

        method(name,(s)->{
            String s1 = new StringBuilder(s).reverse().toString();
            System.out.println(s1);
        });

    }
}
