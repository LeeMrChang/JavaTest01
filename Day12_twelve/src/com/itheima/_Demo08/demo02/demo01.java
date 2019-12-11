package com.itheima._Demo08.demo02;

public class demo01 {
    public static void main(String[] args) {

       // method((s)-> System.out.println(s));
        //方法引用。结果只是为了打印输出
        method(System.out::println);
    }

    public static void method(itheima it){
        it.print("我好烦！！");
    }
}
