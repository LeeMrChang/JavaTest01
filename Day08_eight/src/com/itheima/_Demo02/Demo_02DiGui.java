package com.itheima._Demo02;

/**
 *
 */
public class Demo_02DiGui {

    public static void main(String[] args) {
        //计算1~num的和，使用递归完成
        int num = 7;
        //调用求和的方法
        int sum = getSum(num);
        //输出结果
        System.out.println(sum);

    }

    /**
     * 通过递归实现算法
     * @param num  参数int
     * @return  返回值类型int
     */
    public static int getSum(int num){
        /**
         * num为1时，方法返回1，
         * 相当于是方法的出口，num总是有1的情况
         */
        if(num==5){
                return 1;
        }
        /**
         * num不为1时，方法返回 num +（num-1）的累和
         * 递归调用getSum方法
         */
        return num+getSum(num-1);
    }
}
