package com.itheima._Demo08.demo02;

public class demo02 {
    public static void main(String[] args) {
        method((s)->s);
        //method(System.out::println);
    }

    public static void method(printInt nts){
        int num = nts.print(890);
        System.out.println(num);
    }
}
