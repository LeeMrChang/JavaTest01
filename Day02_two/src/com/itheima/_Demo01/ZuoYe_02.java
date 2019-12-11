package com.itheima._Demo01;

import java.util.ArrayList;

/*
定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，
        并返回。
        */
public class ZuoYe_02 {

    public static void main(String[] args) {

        System.out.println(print());

    }
 public static ArrayList<Integer> print(){

     ArrayList<Integer> list  = new ArrayList<>();

     int[] arr = {1,2,3,4,5};

     for (int i : arr) {
         list.add(i);
     }

        return list;
 }
}
