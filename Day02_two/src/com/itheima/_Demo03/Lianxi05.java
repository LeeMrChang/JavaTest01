package com.itheima._Demo03;

import java.util.ArrayList;

/**
 * 五、定义一个方法listTest(ArrayList<String> al, String s),
 * 要求使用contains()方法判断al集合里面是否包含s。
 */
public class Lianxi05 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();

        list.add("大帅");
        list.add("小鱼");
        list.add("小费");
        list.add("小扬");

        list.toArray();

        boolean ruselt = listTest(list, "小鱼");
        System.out.println("判断结果："+ruselt);

    }
    public static boolean listTest(ArrayList<String> al,String str){
            //判断集合是否包含元素S
        if(al.contains(str)){
            return true;
        }
        return false;
    }
}
