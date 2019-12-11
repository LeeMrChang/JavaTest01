package com.itheima._Demo03;

/**
 * 模仿电影院卖票，用3个窗口卖100张票
 *  创建线程卖票对象，mai，3个窗口就是3个线程任务对象
 */
public class Demo {

    public static void main(String[] args) {
        //创建线程买票对象
        Mai ma = new Mai();
        //再创建3个线程买票任务对象
        Thread t1 = new Thread(ma,"窗口1");
        Thread t2 = new Thread(ma,"窗口2");
        Thread t3 = new Thread(ma,"窗口3");
        //每个线程开始执行各自线程任务
        t1.start();
        t2.start();
        t3.start();


    }
}
