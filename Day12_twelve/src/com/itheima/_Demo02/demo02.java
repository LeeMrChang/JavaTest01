package com.itheima._Demo02;

public class demo02 {

    private static void printInteger(PrintableInteger date){

        date.print(8000);
    }

    public static void main(String[] args) {

        /**
         * 这次方法引用将会自动匹配到 println(int) 的重载形式
         */
        printInteger(System.out::println);

    }
}
