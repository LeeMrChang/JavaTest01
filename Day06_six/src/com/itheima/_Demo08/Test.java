package com.itheima._Demo08;

public class Test {

    public static void main(String[] args) {

        //创建线程对象
        Movie mo = new Movie();
        //创建卖票的子线程对象，使用匿名内部类
        new Thread(mo,"窗口1").start();
        new Thread(mo,"窗口2").start();
        new Thread(mo,"窗口3").start();
        new Thread(mo,"窗口4").start();


    }
}
