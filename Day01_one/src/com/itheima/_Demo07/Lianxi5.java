package com.itheima._Demo07;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 五、请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08
 */
public class Lianxi5 {
    public static void main(String[] args) {

        //需获取当前日期，创建日期类对象
        Date date = new Date();
        //要把当前日期转为为指定格式
        //创建指定日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        //把当前日期添加进此转换格式对象里
        String mat = sdf.format(date);
        //打印输出
        System.out.println("现在的时间日期："+mat);
    }
}
