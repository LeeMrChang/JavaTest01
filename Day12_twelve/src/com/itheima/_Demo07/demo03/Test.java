package com.itheima._Demo07.demo03;

/**
 * 请定义一个函数式接口 Sumable ，内含抽象 sum 方法，可以将两个int数字相加返回int结果。
 * 使用该接口作为方法 的参数，并进而通过Lambda来使用它。
 */
public class Test {

    public static void main(String[] args) {

        int sum = printInt((a, b) -> (a * b), 12, 23);
        System.out.println("两数之和："+sum);

    }
    private static int printInt(Sumabl lambda,int a,int b){

        int sum = lambda.sum(a, b);

        return sum;
    }
}
