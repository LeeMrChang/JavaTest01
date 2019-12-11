package com.itheima._Demo08.demo05;

public class demo {
    public static void main(String[] args) {
        //通过对象名引用静态方法
        method((s)->Math.abs(s),-345);
        method(Math::abs,-345);
    }
    public static void method(Calcable calc, int num){
        int calc1 = calc.calc(-345);
        System.out.println(calc1);
    }
}
