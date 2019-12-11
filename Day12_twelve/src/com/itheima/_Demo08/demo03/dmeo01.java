package com.itheima._Demo08.demo03;

public class dmeo01 {

    public static void main(String[] args) {

        //创建对象，使用对象引用对象里的成员方法
        Method mt = new Method();

        //method(mt::printUpper);
        //对象引用成员方法
        method((s)->mt.printUpper(s));

    }

    public static void method(Printable str){
        str.print("dfghjkdfghjkl！");

    }
}
