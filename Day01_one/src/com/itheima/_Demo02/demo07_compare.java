package com.itheima._Demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo07_compare {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        //
        list.add("d貂蝉");
        list.add("y嬴政");
        list.add("z诸葛亮");
        list.add("m米莱狄");

        //排序方法，按照第一个单词的降序
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//
//                return o1.charAt(0)-o2.charAt(1);
//
//            }
//        });

        System.out.println(list);

    }
}
