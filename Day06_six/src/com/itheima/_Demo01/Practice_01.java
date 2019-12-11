package com.itheima._Demo01;

/**
 *
 */
public class Practice_01{

    public static void main(String[] args) {

            MyThread mt = new MyThread();

            //mt.setName("小林");

            mt.start();//线程运行

        for (int i = 0; i < 200; i++) {
            System.out.println("小费"+i);
        }

    }
}
