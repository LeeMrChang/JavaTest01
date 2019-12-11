package com.itheima._Demo01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_02 {
    public static void main(String[] args) {

        //创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //创建日期对象，可获取现时日期
        Date date = new Date();
        //将日期传入格式化
        String s = sdf.format(date);

        System.out.println(s);


    }
}