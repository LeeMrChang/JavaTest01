package com.itheima._Demo06;

public class Test_02 extends Thread {

    public static void main(String[] args) {
        //创建主线程对象
        Test_02 te = new Test_02();
        //创建主线程任务对象
        Thread tr = new Thread(te);
        tr.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"主线程任务执行"+i+"次");
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"子线程任务执行了"+i+"次！");
        }
    }
}
