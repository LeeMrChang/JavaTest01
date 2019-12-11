package com.itheima._Demo07;

public class Test {

    public static void main(String[] args) {


        //创建隧道类对象
       Person p = new Person();

        //创建线程任务对象,这里要模拟10个人过隧道，所以需要10条线程对象，循环10次

        for (int i = 1; i <= 10; i++) {
            //创建子线程对象
            Thread tr = new Thread(p,"l"+i);

            tr.start();

        }

    }
}
