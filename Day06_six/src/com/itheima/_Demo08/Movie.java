package com.itheima._Demo08;

import java.util.concurrent.locks.ReentrantLock;

public class Movie implements Runnable {
        //定义一个变量做要卖的电影票数
    int count = 100;
    //同步锁
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        //卖票的方法操作
        //卖票窗口未卖完时不会关闭
        while(true){
            //设置个出票时间
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //设置同步锁
            lock.lock();


            //设置同步代码块，
           // synchronized (Movie.class){
                if(count>0){//当票大于0 的时候一直卖票
                    //获取此线程的名称
                    String name = Thread.currentThread().getName();
                    System.out.println(name+"正在售卖第"+count+"张票！");
                    //卖出一张票需要改变票的次数
                    count--;
                }
                lock.unlock();
           // }



        }



    }
}
