package com.itheima.Test_01;

/**
 * @ClassName:Test09
 * @Author：Mr.lee
 * @DATE：2019/08/22
 * @TIME： 9:39
 * @Description: TODO
 */
public class Test09 {

    static  int[] arr = {5,4,3,2,1,0};

    public static void getMaoPao(){

        for (int i = 0; i <arr.length-1 ; i++) {

            for (int j = 0; j < arr.length-1-i; j++) {

                int temp = arr[i];
                arr[j] = arr[i];
                arr[j] = temp;
            }

        }

    }

    public static void main(String[] args) {
        getMaoPao();
    }
}
