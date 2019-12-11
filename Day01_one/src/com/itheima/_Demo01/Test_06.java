package com.itheima._Demo01;

import java.util.Calendar;

public class Test_06 {
    public static void main(String[] args) {
        //创建Calendar对象得格式
        Calendar ca = Calendar.getInstance();
        //设置年
        ca.set(Calendar.YEAR,2020);
        //设置月
        ca.set(Calendar.MONTH,06);
        //设置日
        ca.set(Calendar.DAY_OF_MONTH,18);

        //打印输出
        System.out.println(ca.get(Calendar.YEAR));
        System.out.println(ca.get(Calendar.MONTH));
        System.out.println(ca.get(Calendar.DAY_OF_WEEK));

        }

}
