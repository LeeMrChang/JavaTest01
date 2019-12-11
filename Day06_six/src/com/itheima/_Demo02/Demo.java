package com.itheima._Demo02;

public class Demo {

    public static void main(String[] args) {
        //输出，main方法线程，调用main方法的名称

        System.out.println("这里是："+Thread.currentThread().getName()+"线程");

        //创建线程任务对象
        MyRunnable mr = new MyRunnable();



        //创建线程对象，并绑定线程任务
        Thread t1 = new Thread(mr,"小费");
        //开启新线程
        t1.start();
        //开启main线程
        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName()+"来福"+i);

        }



    }
}
