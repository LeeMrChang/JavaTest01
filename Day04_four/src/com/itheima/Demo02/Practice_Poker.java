package com.itheima.Demo02;

import java.util.*;

public class Practice_Poker {

    public static void main(String[] args) {
        //创建牌盒
        //因为要排序，需要编号，把编号设置为键，牌面设置为值
        HashMap<Integer, String> pokerMap = new HashMap<>();
        //创建2个容器来接收花色和数字，因为要排序，使用list集合
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //把编号设置为一个变量，
        int count = 1;
        //count就是编号，编号就是键，牌面就是值，先把大小王排序再首2位
        pokerMap.put(count++, "🃏");
        pokerMap.put(count++, "😀");
        //先遍历数字再遍历花色，然后合为牌面，添加进牌里面
        for (String number : numbers) {
            for (String color : colors) {
                String card = number + color;
                pokerMap.put(count++, card);
            }
        }
        //洗牌
        //洗牌就是将牌的编号顺序打乱,
        Set<Integer> pokerSet = pokerMap.keySet();
        //Collection是的返回值类型是List，所以需要将Set集合转换为List集合类型
        List<Integer> pokerList = new ArrayList<>(pokerSet);
        //打乱
        Collections.shuffle(pokerList);

        //发牌
        //发的是编号，玩家接收的也是编号，先设置3个玩家容器和1份底牌容器
        ArrayList<Integer> p1No = new ArrayList<>();
        ArrayList<Integer> p2No = new ArrayList<>();
        ArrayList<Integer> p3No = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        //将Listpoker编号集合遍历，分配编号
        for (int i = 0; i < pokerList.size(); i++) {
            //
            if (i >= pokerList.size() - 3) {
                dipai.add(pokerList.get(i));
            } else if (i % 3 == 0) {
                p1No.add(pokerList.get(i));
            }else if(i%3==1){
                p2No.add(pokerList.get(i));
            }else{
                p3No.add(pokerList.get(i));
            }
        }
        //将编号进行排序
        Collections.sort(p1No);
        Collections.sort(p2No);
        Collections.sort(p3No);

        //看牌，把牌面分配下去，设置3个玩家容器和一份底牌容器
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> left = new ArrayList<>();

        for (Integer no : p1No) {
            String one = pokerMap.get(no);
            player1.add(one);
        }
        for (Integer no : p2No) {
            String two = pokerMap.get(no);
            player2.add(two);
        }
        for (Integer no : p3No) {
            String three = pokerMap.get(no);
            player3.add(three);
        }
        for (Integer no : dipai) {
            String four = pokerMap.get(no);
            left.add(four);
        }

        System.out.println("底牌为："+left);
        System.out.println("傅红雪："+player1);
        System.out.println("公子羽："+player2);
        System.out.println("燕南天："+player3);


    }
}
