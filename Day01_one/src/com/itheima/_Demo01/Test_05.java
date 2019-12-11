package com.itheima._Demo01;

import java.util.Calendar;

public class Test_05 {
    public static void main(String[] args) {

        //创建Calendar对象
        Calendar  ca = Calendar.getInstance();
        //设置年
        int year = ca.get(Calendar.YEAR);

        //设置月
        int month = ca.get(Calendar.MONTH)+1;
        //设置日
        int dayOfMonth = ca.get(Calendar.DAY_OF_MONTH);
        //打印输出
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日");

        ca.set(Calendar.YEAR,2001);
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日");

        ca.add(Calendar.DAY_OF_MONTH,2);
        ca.add(Calendar.MONTH,1);
        ca.add(Calendar.YEAR,1);

        System.out.println(year+"年"+month+"月"+dayOfMonth+"日");


    }
}
