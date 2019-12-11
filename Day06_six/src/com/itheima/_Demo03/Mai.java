package com.itheima._Demo03;
/**
 * Lick 锁  java同步机制
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Mai implements Runnable {

    //定义100张票
    int piao = 100;

    Lock lock = new ReentrantLock();


    @Override
    public void run() {

        //卖票窗口不停歇，知道票卖完为止
        while(true){

            //使用同步代码块对问题进行解决,java提供的同步并行机制
            lock.lock();
                if(piao>0){
                    //由于父类没有抛出异常，所以子类也不能抛，只能try
                    //卖票的时候加一个出票时间
                    try {
                        Thread.sleep(60);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //获取窗口名称
                    String name = Thread.currentThread().getName();
                    System.out.println(name+"电影票正在售卖！！"+piao--);
                }
                lock.unlock();



        }

    }
}
