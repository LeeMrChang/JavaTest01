package com.itheima._Demo09;

public class demo01 {

    public static void main(String[] args) {
        method(()-> System.out.println("好冷啊！喝杯可乐吧！"));
    }

    public static void method(Cook col){

        col.makeFood();

    }
}
