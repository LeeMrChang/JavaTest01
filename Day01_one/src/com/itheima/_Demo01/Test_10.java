package com.itheima._Demo01;

public class Test_10 {
    public static void main(String[] args) {

        int[] src = new int[]{1,2,3,4,5};
        int[] str = new int[]{6,7,8,9,10};
        System.arraycopy(src,0,str,0,3);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
