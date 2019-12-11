package com.itheima._Demo05;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 五、请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08
 */
public class Test_01 {

    public static void main(String[] args) {
        //获取了一个日期
        Date da = new Date();
        System.out.println(da);
        //日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");

        String fat = sdf.format(da);
        System.out.println(fat);
    }
}
