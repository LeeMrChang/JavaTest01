package com.itheima._Demo04;

import java.util.Arrays;

/*
现有一个字符数组{'i','t','c','a','s','a'}，
请使用System类中的arraycopy()方法在控制台输出“itcast”。
（提示：将[1]号数组元素复制到最后位置并覆盖原有元素。）
*/
public class ZuoYe_06 {

    public static void main(String[] args) {
        //字符数组
        char[] arr = {'i','t','c','a','s','a'};
        //目的数组
        //int[] abb = new int[6];
        //进行数组复制
        System.arraycopy(arr,1,arr,arr.length-1,1);
        //遍历复制后的数组打印

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }




    }
}
