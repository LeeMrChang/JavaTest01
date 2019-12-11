package com.itheima._Demo08.demo09;

import java.util.function.Supplier;

/**
 * 使用 Supplier 接口作为方法参数类型，通过Lambda表达式求出int数组中的大值。
 * 提示：接口的泛型请使用 java.lang.Integer 类。
 */
public class test02 {

    public static void main(String[] args) {

        Integer[] arr = {1123,234,2345,3456};
        int method = method(() -> {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(method);

    }
    public static int method(Supplier<Integer> lambda){

       return  lambda.get();
    }
}
