package com.itheima._Demo09;

/**
 * 编写程序，创建两个线程对象，一根线程循环输出“播放背景音乐”，另一根线程循环输出“显示画面”，
 * 要求线程实现Runnable接口，且使用匿名内部类实现
 */
public class ZuoYe_02 {

    public static void main(String[] args) {

        //创建线程对象
        //ZuoYe_02 ty = new ZuoYe_02();
        //创建匿名内部对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("播放背景音乐！");
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("显示画面！");
                }
            }
        }).start();
    }
}
