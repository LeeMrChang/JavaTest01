package com.itheima._Demo01;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int[] abb = new int[6];

        System.arraycopy(arr,1,abb,1,4);

        System.out.println(Arrays.toString(abb));

    }
}
