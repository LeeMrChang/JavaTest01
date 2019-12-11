package com.itheima._Demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//用程序判断2018年2月14日是星期几
public class ZuoYe_05 {

    public static void main(String[] args) throws ParseException {


        //创建日历对象
        Calendar lar = Calendar.getInstance();
        //设置年月日
        /*lar.set(Calendar.YEAR,2018);
        lar.set(Calendar.MONTH,01);
        lar.set(Calendar.DAY_OF_MONTH,14);*/
        lar.set(2018,01,14);
        //获取年月日
        lar.get(Calendar.YEAR);
        lar.get(Calendar.MONTH);
        lar.get(Calendar.DAY_OF_MONTH);

        char week = getWeek(Calendar.WEEK_OF_MONTH);

        System.out.println(week);

    }

    public static char getWeek(int a) {
        char[] c = {' ', '日', '一', '二', '三', '四', '五', '六'};
        return c[a];
    }
}
