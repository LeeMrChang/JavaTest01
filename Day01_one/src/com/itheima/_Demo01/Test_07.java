package com.itheima._Demo01;

import javax.xml.crypto.Data;
import java.util.Calendar;

public class Test_07 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        System.out.println(start);

        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("共耗时秒："+(end-start));

    }
}
