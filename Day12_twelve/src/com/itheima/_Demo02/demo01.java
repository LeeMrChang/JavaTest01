package com.itheima._Demo02;

public class demo01 {

    private static void printString(PrintTable table){
        table.print("Hello Word！");
    }

    public static void main(String[] args) {

        printString(s -> System.out.println(s));
        /**
         * 双冒号！新语法
         * 双冒号 :: 为引用运算符，而它所在的表达式被称为方法引用
         */
        printString(System.out::println);

    }
}
