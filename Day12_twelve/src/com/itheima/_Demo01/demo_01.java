package com.itheima._Demo01;

/**
 * 函数式接口
 */
public class demo_01 {

    //使用自定义的函数式接口作为方法参数
    private static void print(MyFunctionalInterface inter){
            inter.myMethod();
    }


    public static void main(String[] args) {

        //调用使用函数式接口的方法
        print(()->{
            System.out.println("finfjasm");
        });

    }


}
