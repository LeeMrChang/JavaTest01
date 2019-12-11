package com.itheima._Demo01;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * public static <T> void sort(List<T> list，Comparator<? super T> ) :
 *    将集合中元素按照指定规则排 序。
 */
public class Practice_07 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("nba");
        list.add("cba");
        list.add("bba");
        list.add("sba");
        list.add("mba");

        //Collections.sort(List<T> list，Comparator<? super T>);

        //降序排序  使用比较倒序排列
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0)-o1.charAt(0);
            }
        });
        System.out.println(list);
    }
}
