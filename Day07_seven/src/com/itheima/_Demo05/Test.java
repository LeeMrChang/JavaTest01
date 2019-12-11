package com.itheima._Demo05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {

        //创建线程池对象
        ExecutorService uce = Executors.newFixedThreadPool(2);
        //创建Teacher实现类对象
        Teacher ter = new Teacher();
        //创建线程池里的线程
        uce.submit(ter);
        uce.submit(ter);
        uce.submit(ter);
    }
}
