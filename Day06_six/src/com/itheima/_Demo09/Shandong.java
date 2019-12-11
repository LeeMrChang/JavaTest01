package com.itheima._Demo09;

public class Shandong implements Runnable {
    //定义这个变量用来记录通过山洞的次数
    int count = 1;
    @Override
    public void run() {
            method();
    }
    /**
     * 此方法是一个同步方法
     * 用来描述通过山洞的过程
     */
    public synchronized void method(){
        //设置一个人通过隧道需要5秒钟
        try {
            Thread.sleep(2000);
            System.out.println("     正在通过隧道，需要5秒钟");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"通过隧道，这是第"+count+"个通过隧道的人");
        count++;
    }
}
