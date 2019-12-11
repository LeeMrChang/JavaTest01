package com.itheima.Demo02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
        例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”*/
public class ZuoYe_05 {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("abc");
        list.add("bad");
        list.add("bad");
        list.add("cad");

        HashMap<Character,Integer> map = new HashMap<>();
        //遍历list集合
        for (String str : list) {
            //将list中的字符串转换为字符数组
            char[] cha = str.toCharArray();
            //再遍历字符数组，计算字符出现的次数
            for (char c : cha) {

                Integer num = map.get(c);
                //如果次数为空,说明该字符第一次出现
                if(num==null){
                    //将字符放入key，将字符出现系数设置为1
                    map.put(c,1);
                }else{
                    //如果字符出现次数不为null,那就把字符出现的次数加1
                    map.put(c,num+1);
                }
            }
        }
        System.out.println(map);
        map.containsKey("键");
                map.containsValue("值");
        

    }
}
