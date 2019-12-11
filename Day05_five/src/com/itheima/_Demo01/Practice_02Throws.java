package com.itheima._Demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常的量中声明方式：
 * 1、声明异常  关键字 throws
 * 2、捕获异常   关键字  try... catch..finally
 */
public class Practice_02Throws {

    public static void main(String[] args) throws ParseException {
        //日期格式化：
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM--dd");

        String str = "2021--08--08";
        //日期解析格式
        Date put = sdf.parse(str);

        System.out.println(put);
    }
}
