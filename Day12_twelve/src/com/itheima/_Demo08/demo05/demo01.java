package com.itheima._Demo08.demo05;

import com.itheima._Demo03.StringUtils;

/**
 * 请自定义一个函数式接口 StringChecker ，其中的抽象方法 checkBlank 的预期行为与 isBlank 一致，
 * 并定义一个 方法使用该函数式接口作为参数。
 * 通过方法引用的形式，将 StringUtils 工具类中的 isBlank 方法作为Lambda的 实现
 */
public class demo01 {
    public static void main(String[] args) {
        //通过对象名引用成员方法
        method("",(s)-> StringUtils.isBlank(s));
    }
    public static void method(String str,StringChecker ker){
        boolean b = ker.checkBlank("打开尼玛的王者荣耀！");
        System.out.println(b);
    }
}
