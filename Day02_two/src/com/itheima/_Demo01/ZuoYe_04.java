package com.itheima._Demo01;

import java.util.ArrayList;

/*定义一个方法listTest(ArrayList<String> al, String s),
        要求使用contains()方法判断al集合里面是否包含s。*/
public class ZuoYe_04 {

    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("亚瑟");
        list.add("妲己");
        list.add("安琪拉");
        list.add("狄仁杰");
        //ZuoYe_04 li = new ZuoYe_04();
        System.out.println(listTest(list,"安其拉"));

    }
    public static boolean listTest(ArrayList<String> al,String s){

        boolean con = al.contains(s);

        return con;
    }
}
