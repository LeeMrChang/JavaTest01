package com.itheima._Demo06;

import java.util.ArrayList;
import java.util.Collections;

public class Demo05_Pai {
    public static void main(String[] args) {
        /**
         * 1,准被牌操作
         */
        //创建牌盒，用来储存牌面
        ArrayList<String> pokerBox = new ArrayList<String>();
        //2,创建花色集合
        ArrayList<String> colors = new ArrayList<String>();
        //3,创建数字集合
        ArrayList<String> numbers = new ArrayList<String>();

        //分别给花色、数字添加元素
        colors.add("@");
        colors.add("#");
        colors.add("$");
        colors.add("*");
        //数字的添加，2到10
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + " ");
        }
        //J、Q、K、A另外在做添加
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        //创造牌，拼接牌操作
        //拿出一个花色，然后跟每一个数字，进行结合，储存到牌盒中去
        for (String color : colors) {
            //color每一个花色
            //遍历数字集合
            for (String number : numbers) {
                //结合
                String card = color + number;
                //存到牌盒中去
                pokerBox.add(card);
            }
        }
        //大小王再做另外添加
        pokerBox.add("大鬼");
        pokerBox.add("小鬼");

        //洗牌
        Collections.shuffle(pokerBox);//使用默认随机源对指定列表进行置换。查API
        //发牌
        //发牌前要创建三个玩家来接受牌
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();

        //三张底牌
        ArrayList<String> dipai = new ArrayList<String>();

        //遍历牌盒
        for (int i = 0; i < pokerBox.size(); i++) {
            //获取牌面
            String card = pokerBox.get(i);
            //留出三张底牌 存到 底牌集合中
            if (i >= 51) {
                dipai.add(card);
            } else {
                //玩家1
                if (i % 3 == 0) {
                    player1.add(card);
                } else if (i % 3 == 1) {
                    player2.add(card);//玩家2
                } else {
                    player3.add(card);//玩家3
                }
            }
        }
        System.out.println("孟星魂："+player1);
        System.out.println("叶秋伯："+player2);
        System.out.println("叶小蝶："+player3);
        System.out.println("底牌："+dipai);


    }
}
