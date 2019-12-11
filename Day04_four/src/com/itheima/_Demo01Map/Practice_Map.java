package com.itheima._Demo01Map;
/*
1. 获取一个字符串对象
2. 创建一个Map集合，键代表字符，值代表次数。
3. 遍历字符串得到每个字符。
4. 判断Map中是否有该键。
5. 如果没有，第一次出现，存储次数为1；如果有，则说明已经出现过，获取到对应的值进行++，再次存储。
6. 打印终结果
*/

import java.util.*;

public class Practice_Map {

    public static void main(String[] args) {
        //创建一个集合
        HashMap<Character,Integer> map = new HashMap<>();
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.nextLine();
        //将字符串转为字符数组
        char[] cha = str.toCharArray();

        for (int i = 0; i < cha.length; i++) {
            //判断map集合中的key是否包含这个字符元素
            if(!map.containsKey(cha[i])){//如果没有存在这个元素，则添加进map集合
                map.put(cha[i],1);
            }else{
                //如果存在，则值++
                Integer count = map.get(cha[i]);
                count++;
                map.put(cha[i],count);
            }
        }
        Set<Map.Entry<Character, Integer>> entry = map.entrySet();

        for (Map.Entry<Character, Integer> eny : entry) {
            System.out.println(eny.getKey()+" 次数为："+eny.getValue());
        }


/*

        for (int i = 0; i < str.length(); i++) {
            //将字符串转为当个字符
            char c = str.charAt(i);

            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                Integer count = map.get(c);
                count++;
                map.put(c,count);
            }
        }

        Set<Map.Entry<Character, Integer>> entry = map.entrySet();

        for (Map.Entry<Character, Integer> eny : entry) {
            System.out.println(eny.getKey()+" 次数为："+eny.getValue());
        }

*/

    }
}
