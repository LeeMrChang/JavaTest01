package com.itheima._Demo03;

import java.util.ArrayList;
import java.util.Random;

/**
 * 十、产生10个1-100的随机数，并放到一个数组中，
 * 把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
 */
public class Lianxi10 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (Integer in : arr) {
            if(in>50){
                list.add(in);
            }
        }
        System.out.println(list);

    }
}
