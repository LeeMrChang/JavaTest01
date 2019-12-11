package com.itheima._Demo01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
1.获取当前时间对应的毫秒值
2.获取自己出生日期对应的毫秒值
3.两个时间相减（当前时间– 出生日期
*/
public class Test_04 {

    public static void main(String[] args) throws ParseException {

        //键盘录入自己的生日
       System.out.println("请输入你的生日：");
       String str = new Scanner(System.in).nextLine();


        //获取当前时间对应的毫秒值
        Date date = new Date();
        long nowTime = date.getTime();
        //System.out.println(nowTime);

        //创建日期格式化，将你的生日日期传入格式化中
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        ////将你的生日日期转换为对应的毫秒值
        Date birtheyDate = sdf.parse(str);
        long birtheyTime = birtheyDate.getTime();


        //当前毫秒减去你生日的毫秒值，获取你出生了多少天
        System.out.println("你出生了" + (nowTime - birtheyTime)/1000/60/60/24 + "天");
    }
}
