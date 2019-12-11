package com.itheima._Demo10.dmeo04;

public class demo {
    public static void main(String[] args) {

        Ticket at = new Ticket();

        Thread t1 = new Thread(at,"1");
        Thread t2 = new Thread(at,"2");
        Thread t3 = new Thread(at,"3");

        t1.start();
        t2.start();
        t3.start();

    }
}
