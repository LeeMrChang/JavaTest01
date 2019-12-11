package com.itheima._Demo02;

public class Thread01 extends Thread {

    @Override
    public void run() {

        long statr = System.currentTimeMillis();//获取时间毫秒值

        for (int i = 0; i < 100000; i++) {
            Integer a = i;
        }
        long end = System.currentTimeMillis();

        System.out.println("线程执行时间1"+(end-statr));
    }
}
