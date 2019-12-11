package com.itheima._Demo09;

import com.itheima._Demo06.Calculator;

public class demo03 {
    public static void main(String[] args) {

        int result = method(13, 45, (a, b) -> (a * b));
        System.out.println(result);

    }
    public static int method(int a, int b, Calculator calc){

        int num = calc.calc(a, b);
        return num;

    }
}
