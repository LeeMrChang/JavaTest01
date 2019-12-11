package com.itheima._Demo02;
/*
根据要求练习LinkedList方法：
基本方法：add, set, get, remove, clear, size等方法；
        （2）特有方法：addFirst, addLast, getFirst, getLast,
        removeFirst,removeLast, push, pop, clear等方法。
        */

import java.util.Collections;
import java.util.LinkedList;

public class ZuoYE_01List {

    public static void main(String[] args) {

        LinkedList<String> link = new LinkedList<>();
        //添加元素
        link.add("貂蝉");
        link.add("吕布");
        link.add("赵云");
        link.add("张良");
        Collections.addAll(link,"关羽","诸葛亮","司马懿");
        //将元素推进此列表所表示的栈堆
        link.push("娜扎");
        System.out.println(link);
        //pop  从此列表所表示的堆栈处弹出一个元素
        link.pop();
        System.out.println(link);
        //清空
        link.clear();
        System.out.println(link);



        //addFirst,在首位素引添加元素
        link.addFirst("典韦");
        System.out.println(link);
        //addlast ,在末尾添加元素
        link.addLast("鲁班");
        System.out.println(link);
        //getFirst 获取首位元素
        System.out.println(link.getFirst());
        //getLast  获取末尾元素
        System.out.println(link.getLast());
        //removeFirst 删除首位元素
        System.out.println(link.removeFirst());
        //removeLast 删除末尾元素
        System.out.println(link.removeLast());
        System.out.println(link);


        //set
        link.set(2, "典韦");
        System.out.println(link);
        //get
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        System.out.println(link.get(1));
        //remove
        System.out.println(link.remove(0));
        System.out.println(link);
        //size()
        System.out.println(link.size());

        //clear
        link.clear();
        System.out.println(link);

    }
}
