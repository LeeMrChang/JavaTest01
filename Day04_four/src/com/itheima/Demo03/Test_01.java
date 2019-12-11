package com.itheima.Demo03;

import java.util.HashMap;
import java.util.Map;

/**
 * 修改并返回给定的映射如下:如果键“a”有一个值，则将键“b”设置为该值，
 * 并将键“a”设置为该值“”。基本上，“b”是一个霸凌，接受值并用空字符串替换它。
 */
public class Test_01 {

    public static void main(String[] args) {

    }
    public Map<String, String> mapBully(Map<String, String> map) {

       if(map.containsKey("a")){
            map.put("b",map.get("a"));
            map.put("a"," ");
       }
       return map;
    }
}
