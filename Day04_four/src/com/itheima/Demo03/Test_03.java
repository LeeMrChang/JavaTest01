package com.itheima.Demo03;

import java.util.Map;
import java.util.Set;

/**
 * 修改并返回给定的映射如下:对于这个问题，映射可能包含也可能不包含“a”和“b”键。
 * 如果两个键都存在，将它们的两个字符串值附加在一起，并将结果存储在键“ab”下。
 */
public class Test_03 {

    public static void main(String[] args) {

    }
    public Map<String, String> mapAB(Map<String, String> map) {

        if(map.containsKey("a")&&map.containsKey("b")){
            map.put("ab",map.get("a")+map.get("b"));
        }

        return map;

    }
}
