package com.itheima._Demo04;

public class Demo {

    public static void main(String[] args) {
        //创建线程对象
        Movie mr = new Movie();

        //创建3个卖票的线程任务对象
        Thread t1 = new Thread(mr,"窗口1");
        Thread t2 = new Thread(mr,"窗口2");
        Thread t3 = new Thread(mr,"窗口3");

        //线程分别开启执行
        t1.start();
        t2.start();
        t3.start();

    }
}
