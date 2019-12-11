package com.itheima.Demo03;

import java.util.Map;

/**
 * 给定食物键和顶部值的映射，修改并返回地图如下：如果存在关键“冰淇淋”，​​
 * 则将其值设置为“樱桃”。在所有情况下，将关键字“bread”设置为值“butter”。
 */
public class Test_04 {

    public static void main(String[] args) {

    }
    public Map<String, String> topping1(Map<String, String> map) {

        map.put("bread","butter");
        if(map.containsKey("ice cream")){
          map.put("ice cream","cherry");
        }

        return map;
    }
}

