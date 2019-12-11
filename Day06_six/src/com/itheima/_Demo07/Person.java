package com.itheima._Demo07;

public class Person implements Runnable {
    //定义一个变量来计算通过隧道人次的次数
    int count = 0;

    @Override
    public void run() {
        print();
    }

    /**
     * 这是一个同步方法
     * 用来模拟每个人通过隧道的方法
     */
    public synchronized void print() {

        try {
            Thread.sleep(5000);
            System.out.println("    隧道慢行，通过大概需要5秒钟！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        System.out.println(Thread.currentThread().getName() + "通过隧道，这是第" + count + "个通过隧道的人");
    }
}
