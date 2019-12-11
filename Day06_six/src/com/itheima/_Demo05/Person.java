package com.itheima._Demo05;

public class Person implements Runnable {

    int piao = 100;
    String lock = new String();


    @Override
    public void run() {

        while(true){

            synchronized (lock){
                if(piao>0){
                    //售票时间
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //获取线程名称
                    String win = Thread.currentThread().getName();
                    System.out.println(win+"小林去拉屎！"+piao--);
                }

            }
        }
    }
}
