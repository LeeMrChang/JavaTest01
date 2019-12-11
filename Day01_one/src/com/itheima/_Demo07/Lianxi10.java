package com.itheima._Demo07;

/**
 * (1)定义数字字符串数组{"010","3223","666","7890987","123123"}；
 * 	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，
 * 	第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出；
 * 	(3)如：010 是对称的，3223 是对称的，123123 不是对称的；
 * 	(4)最终打印该数组中对称字符串的个数。
 */
public class Lianxi10 {
    public static void main(String[] args) {
        //定义字符串数组
        String[] arr = {"010","3223","666","7890987","123123"};
        //判断字符串数组是否对称
        //先遍历数组再进行判断
        int count = 0;//定义一个变量来统计对称元素的个数
        for (String s : arr) {
            //创建Stirngbuilder对象,再将数组的元素传入
            StringBuilder sb = new StringBuilder(s);
            //判断第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的
            if(sb.reverse().toString().equals(s)){
                //将该字符序列被序列的相反代替。然后与字符比较，如果对称则++
                count++;
                System.out.println(s+"是对称的");
            }
        }
        System.out.println("对称的总个数是："+count);


    }
}
