package com.itheima._Demo03;

/**
 * 通过类名称引用静态方法
 * Math类中已经存在静态方法abs
 */
public class demo02 {

    private static void method(int num,Calcable calc){

        System.out.println(calc.calc(num));
    }

    /**
     * Lambda表达式： n -> Math.abs(n)
     * 方法引用： Math::abs
     * @param args
     */

    public static void main(String[] args) {

        method(10,num -> Math.abs(num));
        //属于对象名引用成员方法（是一个静态成员方法）
        method(-10,Math::abs);
    }
}
