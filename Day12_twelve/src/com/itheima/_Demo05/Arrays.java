package com.itheima._Demo05;

/**
 * Lambda表达式： length -> new int[length]
 * 方法引用： int[]::new
 */
public class Arrays {

    private static int[] print(int len,ArraysBuilder build){
        return  build.buildArray(len);
    }

    public static void main(String[] args) {
        int[] array = print(10,length -> new int[length]);

        int[] brray = print(10,int[]::new);


    }


}
