package com.itheima._Demo04;

public class Demo_01 {

    public static void main(String[] args) {
        /**
         * 使用Lambda表达式进行调用
         */
       /* print(120,130,(int x,int y)->{
            return x+y;
        });*/
        /**
         * Lambda表达式的省略模式写法
         */
        print(120,130,(x,y)->x+y);
    }

    /**
     * 定义一个方法，传参
     * @param a  计算机接口的第一个参数
     * @param b  计算机接口的第二个参数
     * @param clac    调用接口方法
     */
    public static void print(int a, int b,Claculator clac){

       int sum = clac.calc(a,b);
        System.out.println(sum);

    }
}
