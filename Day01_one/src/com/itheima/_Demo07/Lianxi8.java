package com.itheima._Demo07;

/**
 * 八、现有一个字符数组{'i','t','c','a','s','a'}，
 * 请使用System类中的arraycopy()方法在控制台输出“itcast”
 */
public class Lianxi8 {
    public static void main(String[] args) {

        char[] arr = {'i','t','c','a','s','a'};
        //将cha数组中第2个元素，复制到目标数组最后一位数组上
        System.arraycopy(arr,1,arr,arr.length-1,1);
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

