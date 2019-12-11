package com.itheima._Demo05;

public class Port_test {

    public static void main(String[] args) {

        //创建线程对象
        Port po = new Port();
        //创建线程任务对象
        Thread t = new Thread(po);

        t.start();
        for (int i = 1; i <=100 ; i++) {
            System.out.println(Thread.currentThread().getName()+"TMD，又来电了"+i);
        }
    }
}
