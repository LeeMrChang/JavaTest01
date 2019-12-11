package com.itheima._Demo07;

import java.util.Calendar;

/*8
七、用程序判断2018年2月14日是星期几。
 */
public class Lianxi7 {
    public static void main(String[] args) {

        //创建日历Calendar对象
        Calendar c = Calendar.getInstance();
        //将给定的日历字段设置到Calendar对象中去
        c.set(Calendar.YEAR,2018);
        c.set(Calendar.MONTH,02);
        c.set(Calendar.DATE,14);

        //设置年
        int year = c.get(Calendar.YEAR);
        //设置月
        int month = c.get(Calendar.MONTH);
        //设置日
        int day = c.get(Calendar.DAY_OF_WEEK);
        //

        char getweek = getweek(c.get(Calendar.DAY_OF_WEEK));


        System.out.println(getweek);
    }

    /**
     * 定义一个方法，获取星期汉字
     * @return
     */

    public static char getweek(int a){
        char[] c = {'一','二','三','四','五','六','日'};
        return c[a];
    }
}
