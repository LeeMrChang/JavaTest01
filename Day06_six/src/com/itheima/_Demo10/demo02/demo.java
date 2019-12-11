package com.itheima._Demo10.demo02;

public class demo {
    public static void main(String[] args) {
        //创建自定义类对象，线程任务对象
        MyRunnable my = new MyRunnable();
        //创建线程对象
        Thread rt = new Thread(my,"尼玛的!");
        //调用线程任务对象
        rt.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread()+"不要！我们要打球去！！"+i);
        }
    }
}
