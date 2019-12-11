package com.itheima._Demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *九、ArrayList集合中有如下内容：
 * {33,11,77,55}，使用Collections.sort()对ArrayList集合中的数据进行排序，
 * 并打印出排序后的结果。
 */

public class ZuoYe_05Coll {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);
        //升序排列
        /*Collections.sort(list);
        System.out.println(list);*/
        //降序排列
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);

    }
}
