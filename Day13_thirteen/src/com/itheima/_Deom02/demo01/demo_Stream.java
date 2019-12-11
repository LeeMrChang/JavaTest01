package com.itheima._Deom02.demo01;

import java.util.*;
import java.util.stream.Stream;

/**
 * 根据Collection获取流
 */
public class demo_Stream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        //List集合
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        //Set集合
        Stream<String> stream2 = set.stream();

        Vector<String >  vec = new Vector<>();

        vec.stream();

    }
}
