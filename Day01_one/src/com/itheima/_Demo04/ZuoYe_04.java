package com.itheima._Demo04;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

//使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
public class ZuoYe_04 {

    public static void main(String[] args) {

        //创建日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        //获取现时时间
        Date date = new Date();
        //格式化
        String s = sdf.format(date);
        //
        System.out.println(s);


    }
}
