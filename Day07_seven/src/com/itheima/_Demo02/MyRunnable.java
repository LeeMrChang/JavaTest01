package com.itheima._Demo02;

public class MyRunnable implements Runnable {


    @Override
    public void run() {


            synchronized (MyRunnable.class){
                try {
                    System.out.println("我需要一个游泳教练！");
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"教练来了");
                System.out.println("我学会游泳了，教练返回游泳池中！");
            }


    }
}
