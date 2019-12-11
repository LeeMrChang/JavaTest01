package com.itheima._Demo05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 七、用程序判断2018年2月14日是星期几。
 */
public class Test_03 {

    public static void main(String[] args) throws ParseException {
        //创建日历对象
        Calendar c = Calendar.getInstance();
        //
        c.set(2018,02,14);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day  = c.get(Calendar.DAY_OF_WEEK);




    }
}
