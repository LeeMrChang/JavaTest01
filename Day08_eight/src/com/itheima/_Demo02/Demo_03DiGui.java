package com.itheima._Demo02;

/**
 * 递乘的递归
 */
public class Demo_03DiGui {
    public static void main(String[] args) {
            //计算n的介乘，使用递归完成
        int n = 3;
        //调用求递乘的方法
        int sum = getValue(n);

        System.out.println("结果是："+sum);

    }

    public static int getValue(int n){
        //1的介乘为1
        if(n==1){
            return 1;
        }
        return n*getValue(n-1);
    }
}
