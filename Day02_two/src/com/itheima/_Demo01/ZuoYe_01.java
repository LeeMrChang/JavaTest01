package com.itheima._Demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
给定以下代码，请定义方法public static int listTest(Collection<String> list,String s)
        统计集合中指定元素出现的次数，如"a":2,"b": 2,"c" :1, "xxx":0。
        */
public class ZuoYe_01 {

    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("xxx:"+listTest(list, "xxx"));




    }

    public static int listTest(Collection<String> list,String s){
        /*    //设置计数起
        int count = 0;
        //向下强转
        ArrayList<String> ler = (ArrayList<String>) list;

            for (int i = 0; i < list.size(); i++) {
               if(s == ler.get(i)){
                   count++;
               }
        }
        return count;*/
        //用迭代器遍历
        Iterator<String> it = list.iterator();
        int count =0;
        while(it.hasNext()){
            String stu = it.next();
            if(s == stu){
                count++;
            }
        }
        return count;

    }

}
