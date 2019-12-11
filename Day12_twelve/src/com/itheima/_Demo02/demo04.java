package com.itheima._Demo02;

/**通过对象引用方法名称
 * 请自定义一个函数式接口 WorkHelper ，其中的抽象方法 help 的预期行为与 dealFile 方法一致，
 * 并定义一个方法 使用该函数式接口作为参数。通过方法引用的形式，
 * 将助理对象中的 help 方法作为Lambda的实现。
 */
public class demo04 {
    private static void printString(WorkHelper date){

        date.help("机密文件");
    }

    public static void main(String[] args) {

        //创建对象
       Assistant ass = new Assistant();
        //通过对象引用成员方法
        printString(ass::dealFile);


    }
}
