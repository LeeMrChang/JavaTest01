package com.itheima._Demo01.demo03;

import java.util.ArrayList;
import java.util.List;

public class demo_Stream {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张三丰");
        list.add("张翠山");


        System.out.println("========================");
        //使用lambda
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s->s.length()==3)
                .forEach(System.out::println);

        //System.out.println(list);


    }

    private static void fun(List<String> list) {
        //获取名字里带张的
        List<String> zhanglist = new ArrayList<>();
        for (String name : list) {
            if(name.startsWith("张")){
                    zhanglist.add(name);
            }
        }
        for (String name : zhanglist) {
            System.out.println(name);
        }
        //获取名字三个字的
        List<String> sanlist = new ArrayList<>();
        for (String name : list) {
            if(3==name.length()){
                sanlist.add(name);
            }
        }
        for (String name : sanlist) {
            System.out.println(name);
        }
    }
}
