package com.itheima.Demo02;

import java.util.HashMap;
import java.util.Set;

public class test {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put(null,0);
        Set<String> str = map.keySet();
        for (String s : str) {
            Integer te = map.get(s);
            System.out.println(s+" "+te);
        }

    }
}
