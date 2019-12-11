package com.itheima._Demo01;

/**
 * 可变参数
 *
 *   格式：int... arr
 *  可变参数一定要写在参数列表的末尾位置。因为参数不确定
 *
 */
public class Practice_05 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        print(arr);
        print(2,34,5,6,7);
        print(87,876,876,76,65);
        print(1,3,34,3456,4);
        print(56,4,45,3434);
        print(234,2345,2345,3456,4563456,3456,34567,34567,4567,567,567456,7);
    }

    public static void print(int... arr){

        int sum = 0;

        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
