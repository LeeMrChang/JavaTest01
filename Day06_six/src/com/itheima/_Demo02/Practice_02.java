package com.itheima._Demo02;

public class Practice_02 {

    public static void main(String[] args) {
        //使用匿名内部类方式完成线程的开启
        //Runnable的实现类对象
        new Runnable(){
            @Override
            public void run() {
                System.out.println("这就是一个新的线程！");
            }
        };//相当于MyRunnable

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(Thread.currentThread().getName()+"尼玛的"
                    );
                }
            }
        }).start();
        //相当于new Thread(new Runnable).start()

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"这就是一个新的线程！");
            }
        };

        new Thread(runnable).start();


    }
}
