package com.itheima._Demo04;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。
public class ZuoYe_03 {

    public static void main(String[] args) throws ParseException {


       //创建日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取当前时间
        Date date = new Date();
        // 格式化日期
        String str = sdf.format(date);

        System.out.println(str);

        long ong = System.currentTimeMillis();

        System.out.println(ong);


    }
}
