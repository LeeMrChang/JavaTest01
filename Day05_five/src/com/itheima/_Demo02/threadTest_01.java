package com.itheima._Demo02;

public class threadTest_01 {

    public static void main(String[] args) {

        MyThread my = new MyThread();

        my.run();
        for (int i = 0; i < 1000; i++) {
            if(i%2==1){
                System.out.println(i);
            }
        }


    }
}
