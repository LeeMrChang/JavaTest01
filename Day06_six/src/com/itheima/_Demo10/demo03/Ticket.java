package com.itheima._Demo10.demo03;

/**
 * 使用Runnable接口模拟卖票线程案例
 */
public class Ticket implements Runnable {
    //定义一个变量设置电影票的量
    private int ticket = 100;

    /**
     *
     */
    @Override
    public void run() {
        //卖票窗口没卖完之前一直开启
        while (true) {
            //设置同步锁
            synchronized (Ticket.class){
                //如果票还没卖完
                if (ticket > 0) {
                    //如果卖一张票需要2秒
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //设置此卖票线程的名称
                    String name = Thread.currentThread().getName();
                    //卖票操纵
                    System.out.println(name + "正在卖票" + ticket--);
                }
            }
        }
    }


}
