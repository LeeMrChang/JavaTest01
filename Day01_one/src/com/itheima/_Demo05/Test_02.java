package com.itheima._Demo05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 六、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
 */
public class Test_02 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date ser = sdf.parse("2018-03-04");

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");

        String mat = sdf2.format(ser);

        System.out.println(mat);


    }
}
