package com.itheima.Demo03;

import java.util.Map;

/**
 * 修改并返回给定的映射如下:如果键“a”有一个值，则将键“b”设置为具有相同的值。
 * 在所有情况下，删除键“c”，保持映射的其余部分不变。
 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
 * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
 */
public class Test_02 {

    public static void main(String[] args) {

    }

    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c",map.get("c"));
        if(map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        return map;
    }
}
