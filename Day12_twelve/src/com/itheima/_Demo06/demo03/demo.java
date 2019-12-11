package com.itheima._Demo06.demo03;

/**
 * 1.	定义一个函数式接口NumberToString,其中抽象方法String convert(int num)，
 * 使用注解@FunctionalInterface
 * 2.	在测试类中定义static void decToHex(int num ,NumberToString nts),
 * 该方法的预期行为是使用nts将一个十进制整数转换成十六进制表示的字符串，
 * tips:已知该行为与Integer类中的toHexString方法一致
 * 3.	测试decToHex (),使用方法引用完成需求
 */
public class demo {
    public static void main(String[] args) {
        //匿名内部类
        decToHex(new NumberToString() {
            @Override
            public String convert(int num) {
                return Integer.toHexString(num);
            }
        },34);
        //lambda表达式
        decToHex((num)->Integer.toHexString(num),56);
        //方法引用   前对象后方法
        decToHex(Integer::toHexString,57);

    }

    public static void decToHex(NumberToString nts,int num){
        //
        String convert = nts.convert(num);

        System.out.println(convert);
    }
}
