package com.itheima._Demo06;

import java.util.Calendar;

/**
 *
 */
public class Test {

    public static void main(String[] args) {
        //
       // print(150,120,(a,b)->(a-b));
        print(123,89,(a,b)->{
            return a-b;
        });

    }

    public static void print(int a, int b, Calculator calc){

        int result = calc.calc(a,b);

        System.out.println("结果是："+result);
    }
}
