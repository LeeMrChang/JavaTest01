package com.itheima._Demo02;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            //currentThread()，返回当前正在执行的线程对象的引用，才能调用到它的名字
        }
    }
}
