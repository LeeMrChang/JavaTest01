package com.itheima._Demo01;

import java.util.LinkedList;

/**
 * 练习LinkedList集合 List属下
 *
 */
public class Practice_02 {

    public static void main(String[] args) {
        //创建集合
        LinkedList<String> link = new LinkedList<>();
        //将元素添加到头位置  link.First
        link.addFirst("itheima1");//4
        link.addFirst("itheima2");//3
        link.addFirst("itheima3");//2
        link.addFirst("itheima4");//1
        System.out.println(link);
        //获取元素   link.get
        System.out.println(link.getLast());//获取未位置元素
        System.out.println(link.getFirst());//获取首位置元素
        //删除元素
        System.out.println(link.removeLast());//删除末位置元素
        System.out.println(link.removeFirst());//删除首位置元素
        //System.out.println(link.remove(2));
        //所有元素弹出集合  link.pop()
        while(!link.isEmpty()){//判断集合是否为空
            System.out.println(link.pop());
        }
        System.out.println(link);

    }

}
