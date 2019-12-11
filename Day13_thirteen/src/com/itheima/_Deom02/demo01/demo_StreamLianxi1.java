package com.itheima._Deom02.demo01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 1. 第一个队伍只要名字为3个字的成员姓名；
 * 2. 第一个队伍筛选之后只要前3个人；
 * 3. 第二个队伍只要姓张的成员姓名；
 * 4. 第二个队伍筛选之后不要前2个人；
 * 5. 将两个队伍合并为一个队伍；
 * 6. 根据姓名创建 Person 对象；
 * 7. 打印整个队伍的Person对象信息
 */
public class demo_StreamLianxi1 {
    public static void main(String[] args) {

        List<String> one = new ArrayList<>();

        one.add("欧阳曦");
        one.add("朱七七");
        one.add("白飞飞");
        one.add("朱老八");
        one.add("熊猫儿");
        one.add("沈浪");
        one.add("王菱花");
        one.add("李长青");

        List<String> two = new ArrayList<>();

        two.add("啊飞");
        two.add("荆无命");
        two.add("上官金环");
        two.add("卢小嘉");
        two.add("李寻欢");
        two.add("李世民");
        two.add("李坏");
        two.add("杨戬");



        //1. 第一个队伍只要名字为3个字的成员姓名；
        // * 2. 第一个队伍筛选之后只要前3个人；
        Stream<String> ones = one.stream().filter(s -> s.length() == 3).limit(3);

        //第二个队伍只要姓张的成员姓名；
        // * 4. 第二个队伍筛选之后不要前2个人
        Stream<String> twos = two.stream().filter(s -> s.startsWith("李")).skip(two.size()-2);

        // 根据姓名创建 Person 对象；
        // * 7. 打印整个队伍的Person对象信息
        Stream.concat(ones,twos).map(Person::new).forEach(System.out::println);

    }
}
