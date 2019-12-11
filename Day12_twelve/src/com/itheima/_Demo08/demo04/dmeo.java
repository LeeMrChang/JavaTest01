package com.itheima._Demo08.demo04;

/**
 * 请自定义一个函数式接口 WorkHelper ，其中的抽象方法 help 的预期行为与 dealFile 方法一致，并定义一个方法 使用该函数式接口作为参数
 * 。通过方法引用的形式，将助理对象中的 help 方法作为Lambda的实现。
 */
public class dmeo {

    public static void main(String[] args) {

        Assistant as = new Assistant();
        //通过对象m名引用成员方法
        method((s)->as.dealFile(s));
        //
        method(as::dealFile);

    }
    public static void method(WorkHelper work){
        work.help("机密文件!");
    }
}

