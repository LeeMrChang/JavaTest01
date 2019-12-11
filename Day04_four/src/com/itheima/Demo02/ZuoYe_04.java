package com.itheima.Demo02;

import java.util.*;

/*
有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
        第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，将第一个数组元素作为key，
        第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
        */
public class ZuoYe_04 {

    public static void main(String[] args) {

        String[] arr = {"黑龙江省","浙江省","江西省","广东省","福建省"};

        String[] abb = {"哈尔滨","杭州","南昌","广州","福州"};

        List<String> list = new ArrayList<>();

        HashMap<String,String> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String key = arr[i];
            String value = abb[i];
            map.put(key,value);
        }

        //
        Set<String> str = map.keySet();
        for (String s : str) {
            String value = map.get(s);
            System.out.println(s+" "+value);
        }


    }
}
