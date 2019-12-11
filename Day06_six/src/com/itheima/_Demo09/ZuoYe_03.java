package com.itheima._Demo09;

/**
 * 编写一个Java程序，要求在同一个类中除main线程外，再开启一个线程，2个线程都循环执行20次。
 */
public class ZuoYe_03 extends Thread{

    public static void main(String[] args) {

        //开启第一个线程
        new Thread(new ZuoYe_03(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"1执行");
                }
            }
        }).start();
        //开启第二条线程
        new Thread(new ZuoYe_03(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"2执行");
                }
            }
        }).start();
    }
}
