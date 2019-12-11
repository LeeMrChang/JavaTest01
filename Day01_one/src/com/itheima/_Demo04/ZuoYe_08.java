package com.itheima._Demo04;
/*
(1)定义数字字符串数组{"010","3223","666","7890987","123123"}；
(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，
第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出；
(3)如：010 是对称的，3223 是对称的，123123 不是对称的；
(4)最终打印该数组中对称字符串的个数。*/

public class ZuoYe_08 {

    public static void main(String[] args) {

        String[] arr = {"010","3223","666","7890987","123123"};


        //设置一个计数器用来计算对称的个数
        int count = 0;
        //遍历字符串数组
        for (int i = 0; i < arr.length; i++) {

            //创建字符串缓冲区
            StringBuilder sb = new StringBuilder();
            //将字符串添加到缓冲区
            sb.append(arr[i]);
            //判断是否对称
            if(arr[i].equals(sb.reverse().toString())){
                count++;
                System.out.println(arr[i]+"字符串对称");
            }
        }
        System.out.println("字符串对称的次数："+count);



    }
}
