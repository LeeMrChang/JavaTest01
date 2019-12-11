package com.itheima._Demo02;

import java.util.LinkedList;

public class demo02_LinkedList {
    public static void main(String[] args) {


        //创建LinkedList对象
        LinkedList<String>  line = new LinkedList<String>();
        //添加元素
        line.add("娜可露露");
        line.add("不知火舞");
        line.add("橘右京");
        line.add("宫本武藏");
        System.out.println(line);
        //遍历一下
        for(String str:line){
            System.out.println(str);
        }
        System.out.println("==========================");
        //获取头尾元素
        System.out.println(line.getFirst());
        System.out.println(line.getLast());

        //删除头尾元素
        System.out.println(line.removeFirst());
        System.out.println(line.removeLast());
        System.out.println(line);

        //判断集合中元素是否为空
        //弹出集合中的栈顶元素
        while(!line.isEmpty()){
            System.out.println(line.pop());//将元素从集合中弹出
        }
        System.out.println(line);//因元素已弹出，所以集合为空
}
    }
