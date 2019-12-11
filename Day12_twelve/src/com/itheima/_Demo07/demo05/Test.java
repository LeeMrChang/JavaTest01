package com.itheima._Demo07.demo05;

import com.itheima._Demo02.WorkHelper;

/**
 * 请自定义一个函数式接口 WorkHelper ，其中的抽象方法 help 的预期行为与 dealFile 方法一致，
 *  * 并定义一个方法 使用该函数式接口作为参数。
 *  * 通过方法引用的形式，将助理对象中的 help 方法作为Lambda的实现。
 */
public class Test {
    public static void main(String[] args) {
        Assistant as = new Assistant();

        printString((String)-> as.dealFile("机密文件"));
       // printString(as::dealFile);
    }
    private static void printString(WorkHelper help){


        help.help("");


    }

}
