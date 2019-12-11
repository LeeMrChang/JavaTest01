package com.itheima._Demo06;

public class Test_01 {

    public static void main(String[] args) {
        //创建线程对象
        Student stu = new Student();

        //创建线程任务对象并调用开启
        Thread ti = new Thread(stu);
        ti.start();
        //创建主线程任务对象并
        while (true){
            System.out.println(Thread.currentThread().getName()+"主线程在执行！");
        }
    }
}
