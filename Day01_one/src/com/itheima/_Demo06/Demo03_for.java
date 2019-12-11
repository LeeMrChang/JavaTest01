package com.itheima._Demo06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo03_for {
    public static void main(String[] args) {
        //
        int[] arr = {1,2,3,4,5};
        //使用增强for遍历数组
        for(int a:arr){//a已经代表数组中所有的元素
            System.out.println(a);
        }


        //创建多态形式的集合
        Collection<String> ioll = new ArrayList<>();
        //添加元素
        ioll.add("荆无命");
        ioll.add("路小佳");
        ioll.add("啊飞");
        ioll.add("傅红雪");
        ioll.add("上官婉儿");
/*
        Iterator<String> list = coll.iterator();
        while(list.hasNext()) {
            String stu = list.next();
            System.out.println(stu);
        }*/

        for(String s:ioll){
            System.out.println(s);
        }




   }
}
