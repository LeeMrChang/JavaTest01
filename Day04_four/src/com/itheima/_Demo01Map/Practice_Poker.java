package com.itheima._Demo01Map;

import java.util.*;

public class Practice_Poker {

    public static void main(String[] args) {

        //创建牌盒
        //牌的编号为键，花色与数字拼接后为值
        HashMap<Integer, String> pokerMap = new HashMap<>();
        //牌需要有序，用List集合存储花色和数字
        porker(pokerMap);
        //打印输出看一下结果
        //System.out.println(map);

        //洗牌 先将牌的编号添加到Set集合
        Set<Integer> pokerSet = pokerMap.keySet();
        //再将牌的编号从Set集合添加到list集合后进行打乱编号
        List<Integer> pokerList = new ArrayList<>(pokerSet);
        //pokerList.addAll(pokerSet);
        //打乱方法的返回值是list，需要将集合转换为list集合
        Collections.shuffle(pokerList);
        //System.out.println(pokerList);
        //发牌
        //创建三个玩家和一份底牌的容器来接收牌，发的是编号，玩家接收的也是编号
        ArrayList<Integer> p1No = new ArrayList<>();
        ArrayList<Integer> p2No = new ArrayList<>();
        ArrayList<Integer> p3No = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        //遍历编号
        for (int i = 0; i < pokerList.size(); i++) {
            //
            if(i>=pokerList.size()-3){
                dipai.add(pokerList.get(i));
            }else if(i%3==1){
                p1No.add(pokerList.get(i));
            }else if(i%3==0){
                p2No.add(pokerList.get(i));
            }else{
                p3No.add(pokerList.get(i));
            }
        }

        Collections.sort(p1No);
        Collections.sort(p2No);
        Collections.sort(p3No);


        //发牌
        //创建三个玩家和一份底牌的容器来接收牌牌面（数字加花色），发的是牌面，玩家接收的也牌面
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> left = new ArrayList<>();

        //遍历编号，把每一个编号添加到每一位玩家的牌面（数字加花色）中去
        //第一位玩家
        for (Integer no : p1No) {
            String one = pokerMap.get(no);
            player1.add(one);
        }
        //第二位玩家
        for (Integer no : p2No) {
            String two = pokerMap.get(no);
            player2.add(two);
        }
        //第三位玩家
        for (Integer no : p3No) {
            String three = pokerMap.get(no);
            player3.add(three);
        }
        //底牌
        for (Integer no : dipai) {
            String di = pokerMap.get(no);
            left.add(di);
        }
        System.out.println("底牌："+left);
        System.out.println("刘备："+player1);
        System.out.println("曹操："+player2);
        System.out.println("孙权："+player3);








    }

    private static void porker(HashMap<Integer, String> pokerMap) {
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //因为需要大小排序，先把大小王排序好
        //设置一个变量代表编号的排序，起始为1.
        int count = 1;
        pokerMap.put(count++, "🃏");
        pokerMap.put(count++, "😀");

        //先遍历数字，再遍历花色
        for (String number : numbers) {
            for (String color : colors) {
                String card = number + color;
                pokerMap.put(count++, card);
            }
        }
    }


}
