package com.itheima._Demo10.demo01;

public class deom {
    public static void main(String[] args) {
        System.out.println("这里是mian线程！");
        MyThread at = new MyThread("雄安");
        //调用子类对象中重写Thread的线程
        at.start();
        //开启新线程
        for (int i = 0; i < 20; i++) {
            System.out.println("旺财"+i);
        }

    }
}
