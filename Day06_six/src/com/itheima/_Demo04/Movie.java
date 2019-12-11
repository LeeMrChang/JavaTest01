package com.itheima._Demo04;

public class Movie implements Runnable {
    //定义一个变量代表电影院的票数
    int piao = 100;

    @Override
    public void run() {

        while (true) {
            method();
        }
    }

    /**
     * 此方法是一个Java同步方法
     *
     */
    public synchronized void method() {

        if (piao > 0) {
            //出票时间
            try {
                Thread.sleep(54);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //获取窗口名称
            String win = Thread.currentThread().getName();
            System.out.println(win+"电影票正在售卖"+piao--);

        }

    }
}
