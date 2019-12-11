package com.itheima._Demo05;

public class Person_test {

    public static void main(String[] args) {

        Person pur = new Person();
        //

        Thread t1 = new Thread(pur,"窗口1");
        Thread t2 = new Thread(pur,"窗口2");
        Thread t3 = new Thread(pur,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
