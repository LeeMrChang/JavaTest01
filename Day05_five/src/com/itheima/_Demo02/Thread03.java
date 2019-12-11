package com.itheima._Demo02;

public class Thread03 extends Thread {

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String c = "凯尔特人总冠军！"+i;
        }
        long end = System.currentTimeMillis();
        System.out.println("线程执行时间3"+(end-start));
    }
}
