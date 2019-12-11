package com.itheima._Demo06.demo04;

/**
 * 2.	定义一个函数式接口NumberSupplier,其中抽象方法int getNum(int...nums)，
 * 使用注解@FunctionalInterface
 * 3.	在测试类中定义static void getRandomNumFromOneToNum(int num , NumberSupplier ns),
 * 该方法的预期行为是使用ns得到一个从1到num(包含1和num)之间的随机数并打印
 * 4.	在测试类中定义static void getRandomNumFromAToB(int a ,int b, NumberSupplier ns),
 * 该方法的预期行为是使用ns得到一个从a到b(包含a和b)之间的随机数并打印
 * 5.	在测试类中定义static void getRandomNumFromArray(int[] nums, NumberSupplier ns),
 * 该方法的预期行为是使用ns从数组nums中获取一个随机元素并打印
 * 6.	主方法中测试调用以上三个方法，使用方法引用完成需求
 */
@FunctionalInterface
public interface NumberSupplier {

       int getNum(int...nums);
}
