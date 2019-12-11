package com.itheima._Demo04;

import java.util.Date;

/*分别使用String的 += 和StringBuilder的append方法对字符串做100000次拼接，
计算String拼接100000次花费时间与StringBuilder拼接100000次所花费时间并打印。*/
public class ZuoYe_07 {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();

        StringBuilder buider = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            buider.append("a");
        }

        long now = System.currentTimeMillis();

        System.out.println(now-time);

        System.out.println("=========================");
        long sta = System.currentTimeMillis();

        String str = "hello";

        for (int i = 0; i < 100000; i++) {
            str+=i;
        }

        long end = System.currentTimeMillis();

        System.out.println(end-sta);



    }
}
