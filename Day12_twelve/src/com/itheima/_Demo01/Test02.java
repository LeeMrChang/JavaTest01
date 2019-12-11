package com.itheima._Demo01;

public class Test02 {
    public static void main(String[] args) {

      /*  print((int a,int b)->{
            return a+b;
        },4,5);*/

        //简化
        print((a,b)->a+b,34,56);

    }

    /**
     *
     * @param sun
     * @param x
     * @param y
     */
    public static void print(Sumable sun,int x ,int y){

        System.out.println(sun.sum(x,y));

    }
}
