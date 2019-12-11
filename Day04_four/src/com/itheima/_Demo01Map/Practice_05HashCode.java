package com.itheima._Demo01Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice_05HashCode {

    public static void main(String[] args) {
        //创建Hash Map集合
        HashMap<Student,String> map = new HashMap<>();
        //添加键值元素
        map.put(new Student("费小奇",25),"安徽");
        map.put(new Student("陈大兴",28),"江西");
        map.put(new Student("林小旭",23),"揭阳");
        map.put(new Student("林小旭",23),"深圳");
        map.put(new Student("林小旭",24),"揭阳");

        //使用Entry遍历
        Set<Map.Entry<Student, String>> entry = map.entrySet();
        //遍历
        for (Map.Entry<Student, String> stu : entry) {
            System.out.println(stu.getKey().getName()+"同学来自"+stu.getValue());
        }


    }
}
