package com.itheima.Demo02;

//往一个Map集合中添加若干元素。获取Map中的所有value，并使用增强for和迭代器遍历输出每个value。
//tips: 参阅Map接口中values()方法

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ZuoYe_01 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        //
        map.put("费琪琪",23);
        map.put("谢星星",22);
        map.put("余克克",21);
        map.put("杨朋朋",22);

        //遍历输出每个value值
        Collection<Integer> value = map.values();
        for (Integer teg : value) {
            System.out.println(teg);
        }
        //使用迭代器进行遍历
        Iterator<Integer> its = value.iterator();
        while(its.hasNext()){
            Integer inu = its.next();
            System.out.println(inu);
        }

    }
}
