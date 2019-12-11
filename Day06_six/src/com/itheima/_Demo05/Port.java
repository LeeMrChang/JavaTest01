package com.itheima._Demo05;

public class Port extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            //获取线程名称
            System.out.println(Thread.currentThread().getName()+"没电了，打球了"+i);
        }

    }
}
