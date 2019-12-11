package com.itheima._Demo09;

import java.util.Arrays;
import java.util.Random;

/**
 * 2个线程，数组长度6，每个线程添加3个数据
 */
public class Test_01 {

    public static void main(String[] args) {

        AbbArray arr = new AbbArray();

        Thread ti = new Thread(arr);
        Thread tf = new Thread(arr);

        ti.start();
        tf.start();
    }
}


class AbbArray implements Runnable{

    private static int[] arr = new int[6];
    private static int index = 0;

    @Override
    public void run() {
        Random r  = new Random();

        for (int i = 0; i < 3; i++) {
            int num = r.nextInt(100);
            synchronized (Runnable.class){
                arr[index] = num;
                index++;
            }
            System.out.println(Thread.currentThread().getName()+"添加的数据:"+num);
            //System.out.println("线程要添加的数据："+num);
            System.out.println("打印数组："+ Arrays.toString(arr));
        }


    }
}