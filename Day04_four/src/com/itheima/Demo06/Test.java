package com.itheima.Demo06;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //创建hash集合
        HashMap<Character,Integer> map = new HashMap<>();
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        //将字符串转换为字符数组
        char[] cha = str.toCharArray();

        //遍历字符数组
        for (int i = 0; i < cha.length; i++) {
            //判断map集合中的key是否包含这个字符元素
            if(!map.containsKey(cha[i])){
                //如果不存在这个元素，则添加进map集合
                map.put(cha[i],1);
            }else{
                //如果存在，则值++
                Integer value = map.get(cha[i]);//值
                value++;
                map.put(cha[i],value);

            }
        }

        Set<Map.Entry<Character, Integer>> ntry = map.entrySet();
        for (Map.Entry<Character, Integer> key : ntry) {
            System.out.println(key.getKey()+"的次数为："+key.getValue());
        }

    }
}

