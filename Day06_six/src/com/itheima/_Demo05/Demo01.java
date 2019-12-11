package com.itheima._Demo05;

public class Demo01 extends Thread {

    public static void main(String[] args) {

        //创建线程对象
        Demo01 tur = new Demo01();
        //创建线程任务对象
        Thread s = new Thread(tur);

        s.start();

    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"上厕所"+i);
        }
    }
}
