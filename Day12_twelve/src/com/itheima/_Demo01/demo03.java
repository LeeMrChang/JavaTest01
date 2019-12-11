package com.itheima._Demo01;

public class demo03 {
    /**
     * startThread使用该类自身拥有的接口作为参数
     * 那么就是对lambda进行传参
     * @param task 参数就是该类的接口，Runnable
     */
    private static void startThread(Runnable task){
            new Thread(task).start();
    }

    public static void main(String[] args) {

        startThread(()-> System.out.println("Lambda执行了！"));
    }
}
