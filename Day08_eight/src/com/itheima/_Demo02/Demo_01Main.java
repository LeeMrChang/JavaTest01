package com.itheima._Demo02;

/**
 * 指在当前方法内调用自己的这种现象
 */
public class Demo_01Main {

    public static void main(String[] args) {

        System.out.println("main");
        main(args);
    }
}
