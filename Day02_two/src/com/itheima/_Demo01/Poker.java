package com.itheima._Demo01;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {

    public static void main(String[] args) {
       //准备牌
        ArrayList<String> poker = new ArrayList<>();

        //准备两个容器来装点数和花色
        String[] shus = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] colors = {"♠","♥","♣","♦"};

        //嵌套遍历两个容器。花色与数字
        for (String color : colors) {
            for (String s : shus) {
                //将花色与数字加在一起
                String num = s + color;
                //将花色与数字一起存入集合中（牌盒）
                poker.add(num);
            }
        }
        //添加大小王入牌盒中
        poker.add("🃏");
        poker.add("😀");


        //洗牌
        Collections.shuffle(poker);

        //发牌
        //设置4个容器来装3份牌和一份底牌
        ArrayList<String> me = new ArrayList<>();
        ArrayList<String> you = new ArrayList<>();
        ArrayList<String> he = new ArrayList<>();
        ArrayList<String> left = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            //判断进行分配
            if(i>=poker.size()-3){//牌的长度最后3张牌给予底牌
                left.add(poker.get(i));
            }else if(i%3==0){//玩家me
                me.add(poker.get(i));
            }else if(i%3==1){//玩家you
                you.add(poker.get(i));
            }else{//玩家he
                he.add(poker.get(i));
            }
        }

        //看牌
        System.out.println("底牌为："+left);
        System.out.println("我的牌"+me);
        System.out.println("你的牌"+you);
        System.out.println("他的牌"+he);



    }
}
