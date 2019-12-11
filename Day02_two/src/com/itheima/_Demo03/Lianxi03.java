package com.itheima._Demo03;

import java.util.ArrayList;

/**
 * 三、定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，
 * 并返回。()
 */
public class Lianxi03 {
    public static void main(String[] args) {
        //创建数组
        int[] array = {1,2,3,4,5};
        //
        ArrayList<Integer> met = method(array);
        System.out.println(met);


    }
    public static ArrayList<Integer> method(int[] arr){
        //定义集合
        ArrayList<Integer> list = new ArrayList<>();
        //遍历数组，把元素依次添加到集合中
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }
}
