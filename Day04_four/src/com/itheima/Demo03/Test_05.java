package com.itheima.Demo03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个字符串数组，返回一个Map <String，Integer>，
 * 其中包含数组中每个不同字符串的键，始终使用值0.例如，
 * 字符串“hello”使对“hello”：0。我们稍后会做更复杂的计数，
 * 但对于这个问题，值只是0。
 */
public class Test_05 {

    public static void main(String[] args) {

        String[] arr = {"abc","cad","cba","bca"};
        System.out.println();
    }

    public  Map<String, Integer> word0(String[] strings) {

        HashMap<String,Integer> map = new HashMap<>();

        for (String key : strings) {
            map.put(key,0);
        }

        return map;

    }
}

