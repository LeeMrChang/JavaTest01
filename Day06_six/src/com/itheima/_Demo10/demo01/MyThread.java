package com.itheima._Demo10.demo01;

/**
 * 创建一个类继承Thtead线程
 */
public class MyThread extends Thread {
    /**
     * 利用继承中的特点
     * 将线程名称进行传递，进行设置
     * @param name
     */
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName()+i);
        }
    }
}
