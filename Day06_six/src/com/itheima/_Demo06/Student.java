package com.itheima._Demo06;

public class Student implements Runnable {

    @Override
    public void run() {
       while(true){
           System.out.println(Thread.currentThread().getName()+"子线程在执行！");
       }
    }
}
