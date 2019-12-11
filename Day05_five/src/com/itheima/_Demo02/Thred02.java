package com.itheima._Demo02;

public class Thred02 extends Thread {

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String b = "火箭总冠军！";
        }
        long end = System.currentTimeMillis();
        System.out.println("线程执行时间2"+(end-start));
    }
}
