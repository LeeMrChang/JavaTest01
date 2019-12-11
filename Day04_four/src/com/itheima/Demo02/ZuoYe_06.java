package com.itheima.Demo02;
/*
利用Map，完成下面的功能：
        从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
        如果该 年没有举办世界杯，
        则输出：没有举办世界杯。

        在原有世界杯Map 的基础上，增加如下功能： 读入一支球队的名字，输出该球队夺冠的年份列表。
         例如，读入“巴西”，应当输出 1958 1962 1970 1994 2002 读入“荷兰”，应当输出 没有获得过世界杯

//tips:参阅Map接口containsValue(Object value)方法

        */
//tips:参阅Map接口containsKey(Object key)方法 ,如果此映射包含指定键的映射关系，则返回 true。

import java.util.HashMap;
import java.util.Scanner;

public class ZuoYe_06 {

    public static void main(String[] args) {

        //
        HashMap<Integer,String> map = new HashMap<>();
        //
        map.put(1930,"乌拉圭");
        map.put(1934,"意大利");
        map.put(1938,"意大利");
        map.put(1950,"乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "德国");
        //输入一个年份，判断，如果那一年有
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int key = sc.nextInt();
        if(map.containsKey(key)){//如果此映射包含指定键的映射关系，则返回 true。
            System.out.println(key+"年"+"世界杯冠军是"+map.get(key));
        }else{
            System.out.println("那一年没有世界杯！！");
        }



    }
}
