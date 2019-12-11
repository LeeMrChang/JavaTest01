package com.itheima._Demo07.demo01;

import java.util.function.Supplier;

/**
 * 使用 Supplier 接口作为方法参数类型，通过Lambda表达式求出int数组中的大值。
 * 提示：接口的泛型请使用 java.lang.Integer 类。
 */
public class Test_02 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

     /*  getString(new Supplier<Integer>() {
           @Override
           public Integer get() {
               int max = 0;
               for (int i = 0; i < arr.length; i++) {
                   if(arr[i]>max){
                       max=arr[i];
                   }
               }

               return max;
           }
       });*/

     getString(()->{
         int max = 0;
         for (int i = 0; i < arr.length; i++) {
             if(arr[i]>max){
                 max=arr[i];
             }
         }
         return max;
     });

    }

    private static void getString(Supplier<Integer> nts) {

        int max = nts.get();

        System.out.println("数组中的最大值是：" + max);
    }
}
