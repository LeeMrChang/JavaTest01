package com.itheima._Demo07.demo04;

/**
 * 请自定义一个函数式接口 MySupplier ，含有无参数的抽象方法 get 得到 Object 类型的返回值。
 * 并使用该函数式 接口分别作为方法的参数和返回值。
 */
public class demo {
    public static void main(String[] args) {

        getPrint(()->"hello!");
        getPrint(getDkata());

    }
    private static void getPrint(MySupplier supplier){

        System.out.println(supplier.get());

    }
    private static MySupplier getDkata(){

      return ()->"hello!";

    }

}
