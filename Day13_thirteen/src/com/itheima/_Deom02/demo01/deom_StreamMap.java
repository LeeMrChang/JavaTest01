package com.itheima._Deom02.demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * 根据Map集合获取流
 */
public class deom_StreamMap {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();

        //获取Map的key（键）Stream流
        Stream<String> key = map.keySet().stream();
        //获取Map的value（值）Stream流
        Stream<Integer> value = map.values().stream();
        //获取Map键值对Stream流
        Stream<Map.Entry<String, Integer>> stream = map.entrySet().stream();


        //根据数组获取Stream流
        String[] array = {"林小旭","费效","浩哥"};

        Stream.of(array);


    }
}
