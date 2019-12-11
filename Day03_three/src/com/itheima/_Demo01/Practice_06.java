package com.itheima._Demo01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Collections 集合工具类
public static <T> boolean addAll(Collection<T> c, T... elements) :
往集合中添加一些元素。
 public static void shuffle(List<?> list) 打乱顺序 :打乱集合顺序。
  public static <T> void sort(List<T> list) :将集合中元素按照默认规则排序。
   public static <T> void sort(List<T> list，Comparator<? super T> ) :
   将集合中元素按照指定规则排 序。

 */
public class Practice_06 {

    public static void main(String[] args) {

        //创建Collections集合工具类
        List<Integer> list = new ArrayList<>();
        //一次添加很多元素  addall（）
        Collections.addAll(list,3,6,5,7,4,2,1,9,8,0);
        //sort()  将集合中元素按照默认规则进行排序
        Collections.sort(list);

        System.out.println(list);


    }
}
