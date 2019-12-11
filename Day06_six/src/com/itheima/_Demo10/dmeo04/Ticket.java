package com.itheima._Demo10.dmeo04;

public class Ticket implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        //卖票窗口没卖完之前一直开启
        while (true) {
            //设置同步锁
            sellTicket();
        }
    }

    /**
     * 同步方法
     */
    public synchronized void sellTicket() {
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