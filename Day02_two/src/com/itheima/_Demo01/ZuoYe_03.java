package com.itheima._Demo01;

import java.util.ArrayList;

/*

定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，
        并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）

*/
public class ZuoYe_03 {

    public static void main(String[] args) {
        //创建int类型集合
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //转换成相同元素的数组
        Object[] objects = list.toArray();

        for (Object o : objects) {
            System.out.println(o);
        }
    }
}
