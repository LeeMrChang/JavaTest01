package com.itheima._Demo06;

public class Demo {

    public static void main(String[] args) {
        //创建第一条线程并开启
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+"播放背景音乐"+i);
                }
            }
        }).start();


        //创建第二条线程并开启
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName()+"系统显示画面！"+i);
                }
            }
        }).start();

    }
}
