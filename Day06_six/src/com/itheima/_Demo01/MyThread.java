package com.itheima._Demo01;

public class MyThread extends Thread {

    //get(name)方法可以给线程设置名字


    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
