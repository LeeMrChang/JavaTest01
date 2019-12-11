package com.itheima._Demo09;

/**
 * 编写程序，在主线程中，循环输出“主线程执行”；在一条新线程中，循环输出“子线
 * 程执行”
 */
public class ZuoYe_01 extends Thread {
    public static void main(String[] args) {

        new Thread(new ZuoYe_01(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName()+"子线程执行"+i);
                }
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"主线程执行");
        }

    }
}
