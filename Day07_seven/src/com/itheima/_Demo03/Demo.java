package com.itheima._Demo03;

/**
 * Lambda更有写法
 * 1、一些参数  2、一个箭头   3、一段代码
 * 格式：（参数类型 参数列表）->{代码段}
 */
public class Demo {
    public static void main(String[] args) {
        invokeCook(()->{
            System.out.println("蛋炒饭！！！");
        });
    }

    public static void invokeCook(Cook cook){
            cook.method();//调用接口的方法
    }
}
