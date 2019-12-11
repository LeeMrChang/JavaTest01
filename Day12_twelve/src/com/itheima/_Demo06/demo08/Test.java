package com.itheima._Demo06.demo08;

/**
 * 1.	定义一个函数式接口ArrayBuilder<T>,提供带泛型的抽象方法T[] buildArray(int length)，
 * 使用注解@FunctionalInterface
 * 2.	在测试类中定义static void getIntegerArray(int length , ArrayBuilder<Integer> builder),
 * 该方法的预期行为是使用builder创建一个长度为length的Integer数组并打印其内存地址
 * 3.	测试getIntegerArray (),使用方法引用完成需求
 */
public class Test {
    public static void main(String[] args) {

        getIntegerArray(100, new ArrayBuilder<Integer>() {
            @Override
            public Integer[] buildArray(int length) {
                return new Integer[100];
            }
        });//(参数列表)->{return }
        //lambda表达式
        getIntegerArray(123,(length)->new Integer[123]);
        //方法引用
        getIntegerArray(345,Integer[]::new);



    }

    public static void getIntegerArray(int length,ArrayBuilder<Integer> builder){

        Integer[] num = builder.buildArray(length);

        System.out.println("数字的内存地址值："+num);
    }
}
