package com.itheima._Demo10.demo03;

public class demo {
    public static void main(String[] args) {


        //创建线程任务对象
       Ticket rt = new Ticket();
        //创建3个卖票窗口
        Thread chu1 = new Thread(rt, "窗口1");
        Thread chu2 = new Thread(rt, "窗口2");
        Thread chu3 = new Thread(rt, "窗口3");

        chu1.start();
        chu2.start();
        chu3.start();

    }
}
