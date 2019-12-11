package com.itheima.Demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test_斗地主 {

    public static void main(String[] args) {
        //创建牌盒
        HashMap<Integer, String> map = new HashMap<>();
        //创建list集合，存储牌里面的键
        List<Integer> list = new ArrayList<>();
        //创建放花色的容器，按照斗地主的规则把牌的顺序排好
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //创建索引，代表54张牌的索引,起始值为1
        int index = 1;
        //遍历花色与数字，然后将容器里的元素存进list集合
        //按照斗地主的规则顺序遍历，应先遍历数字再遍历花色
        for (String number : numbers) {
            for (String color : colors) {
                String card = number + color;
                //将编号和牌面添加进牌盒
                map.put(index, card);
                //将编号添加进list
                list.add(index++);
            }
        }
        //再将大小王添加进牌盒,也需要把大小王的编号添加进list
        map.put(index, "😀");
        list.add(index++);
        map.put(index, "🃏");
        list.add(index);

        //洗牌
        Collections.shuffle(list);

        //发牌，需要4个容器接收，发的是编号，玩家接收的也是编号
        ArrayList<Integer> no1 = new ArrayList<>();
        ArrayList<Integer> no2 = new ArrayList<>();
        ArrayList<Integer> no3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        //遍历list编号,把编号分为4份
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
        //要对分配好的编号进行编号
        Collections.sort(dipai);
        Collections.sort(no1);
        Collections.sort(no2);
        Collections.sort(no3);

        //看牌，看牌需要把花色数字与分配好的编号搭上
        show(map,dipai,"底牌");
        show(map,no1,"浩哥");
        show(map,no2,"发仔");
        show(map,no3,"星仔");
        /**
         * 创建一个方法用来搭配花色数字与分配好的编号
         */


    }
    public static void show( HashMap<Integer, String> map,ArrayList<Integer> arr,String name){
        //使用StringBuiber对字符串进行拼接
        StringBuilder sb = new StringBuilder(name);
        sb.append(" : ");
        for (Integer key : arr) {
            String value = map.get(key);
            sb.append(value).append("\t");
        }
        System.out.println(sb);
    }
}
