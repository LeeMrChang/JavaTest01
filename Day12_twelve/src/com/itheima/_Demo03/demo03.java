package com.itheima._Demo03;

/**
 * 请自定义一个函数式接口 StringChecker ，其中的抽象方法 checkBlank 的预期行为与 isBlank 一致，
 * 并定义一个 方法使用该函数式接口作为参数。通过方法引用的形式，
 * 将 StringUtils 工具类中的 isBlank 方法作为Lambda的 实现。
 */
public class demo03 {
    private static void methodCheck(StringChecker checker){

        System.out.println(checker.checkBlank(" "));
    }

    public static void main(String[] args) {
        //使用StringUtils工具类引用它的isBlank的方法作为lambda的实现
        methodCheck(StringUtils::isBlank);
    }
}
