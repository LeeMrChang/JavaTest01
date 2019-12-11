package com.itheima.Demo05;

import java.util.*;

public class demo09 {
    public static void main(String[] args) {
        //创建牌
        //创建Map集合，创建一个牌盒，储存54张牌
        HashMap<Integer, String> map = new HashMap<>();
        //牌分为花色与数字，定义两个容器来接收花色和数字,而且牌还要按照斗地主的规则将花色和数字排序好
        List<Integer> list = new ArrayList<>();//此集合用来装Map结合的键
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //嵌套遍历牌的数字与牌的花色，然后添加进牌盒
        //因为需要排序，把54张的编号定义为map的键，而且编号的顺序按照斗地主的规则定义
        //大小王的定义
        int count = 1;

        for (String number : numbers) {
            for (String color : colors) {
                //把数字和花色拼接在一起存进牌盒，而且数字与花色拼接起来的牌定义为map的值
                String crad = number + color;
                map.put(count, crad);
                list.add(count++);
            }
        }
        map.put(count, "🃏");
        list.add(count++);
        map.put(count, "😀");
        list.add(count++);
        //洗牌
        // System.out.println(map);
        //将牌的编号打乱,使用Collections集合中的方法将牌的编号打乱
        //因为collections的返回值类型是List，需要先将牌的编号存入List集合

        Collections.shuffle(list);
       // System.out.println(map);

        //发牌
        //创建4个容器来接收3份牌和一份底牌
        ArrayList<Integer> no1 = new ArrayList<>();
        ArrayList<Integer> no2 = new ArrayList<>();
        ArrayList<Integer> no3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        //遍历牌的编号然后分配牌
        for (int i = 0; i < list.size(); i++) {
            //
            if(i>=list.size()-3){
                dipai.add(list.get(i));
            }else if(i%3==0){
                no1.add(list.get(i));
            }else if(i%3==1){
                no2.add(list.get(i));
            }else{
                no3.add(list.get(i));
            }
        }

        //把分配好的牌进行排序
        Collections.sort(dipai);
        Collections.sort(no1);
        Collections.sort(no2);
        Collections.sort(no3);

        //看牌
        show(map,dipai,"底牌");
        show(map,no1,"浩哥");
        show(map,no2,"费奇");
        show(map,no3,"林旭");

    }
    /**
     *
     */
    public static void show(HashMap<Integer,String> map,ArrayList<Integer> list ,String name){
        StringBuilder sb = new StringBuilder(name);
        sb.append(":");
        for (Integer key : list) {
            String value = map.get(key);
            sb.append(value).append("\t");
        }
        System.out.println(sb);
    }
}
