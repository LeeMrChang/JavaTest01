package com.itheima._Demo06.demo08;

/**
 * 1.	定义一个函数式接口ArrayBuilder<T>,提供带泛型的抽象方法T[] buildArray(int length)，
 * 使用注解@FunctionalInterface
 * 2.	在测试类中定义static void getIntegerArray(int length , ArrayBuilder<Integer> builder),
 * 该方法的预期行为是使用builder创建一个长度为length的Integer数组并打印其内存地址
 * 3.	测试getIntegerArray (),使用方法引用完成需求
 * @param <T>
 */
@FunctionalInterface
public interface ArrayBuilder<T> {

    T[] buildArray(int length);

}
