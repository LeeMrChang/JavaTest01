package com.itheima._Demo04;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01 {

    public static void main(String[] args) {
            //
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开启线程");
            }
        }).start();

        new Thread(()->{
            System.out.println("开启线程");
        }).start();

        new Thread(()-> System.out.println("开启线程")).start();

        Integer[] arr = {1,2,3,4,5};

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        Arrays.sort(arr,(o2,o1)->(o2-o1));

        for (Integer ger : arr) {
            System.out.println(ger);
        }

    }
}
