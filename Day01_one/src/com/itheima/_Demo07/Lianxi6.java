package com.itheima._Demo07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 六、使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
 */
public class Lianxi6 {
    public static void main(String[] args) throws ParseException {
        //创建SimpleDateFormat日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //调用sdf中的parse方法，得到对应的日期类型：2018-03-04
        Date date = sdf.parse("2018-03-04");
        //再将日期转换成想要的格式,需再创建一个日期格式化对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String mat = sdf2.format(date);
        //打印输出
        System.out.println(mat);
    }
}
