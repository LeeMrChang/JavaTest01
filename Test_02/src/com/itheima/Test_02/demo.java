package com.itheima.Test_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 现在有两个List集合存储队伍当中的多个成员姓名，要求使用Stream流的方式依次进行以下若干操作步骤：
 * <p>
 * 第一个队伍：{"tom", "kobe", "jordan", "tracy","westbook","yaoming","ace","stephen"}
 * <p>
 * 第二个队伍：{"beyonce", "jay_z", "adele", "taylor","bieber","ladygaga"}
 * <p>
 * 1：第一个队伍只要名字长度大于4的前三名
 * <p>
 * 2：第二个队伍只要名字中带有a的;筛选后不要第一个
 * <p>
 * 3：将两个队伍合并为一个队伍,并最终转换为List集合
 * <p>
 * 4：将最终的队伍中的名字按照名字的字母降序排列（非自然顺序，与自然排序相反，如zyx...cba）
 * <p>
 * 5：使用foreach进行遍历打印最终的名字
 * (30分)反馈该题
 */
public class demo {

    public static void main(String[] args) {
        //第一个List队伍
        List<String> one = List.of("tom", "kobe", "jordan", "tracy", "westbook", "yaoming", "ace", "stephen");
        //第二个List队伍
        List<String> two = List.of("beyonce", "jay_z", "adele", "taylor", "bieber", "ladygaga");
        //第一个队伍只要名字长度大于4的前三名
        Stream<String> ones = one.stream().filter(s -> s.length() > 4).limit(3);
        //第二个队伍只要名字中带有a的;筛选后不要第一个
        Stream<String> twos = two.stream().filter(s -> s.contains("a")).skip(1);
        //将两个队伍合并为一个队伍,并最终转换为List集合
        List<String> coll = Stream.concat(ones, twos).collect(Collectors.toList());
        //将最终的队伍中的名字按照名字的字母降序排列（非自然顺序，与自然排序相反，如zyx...cba）
        Collections.sort(coll, (a, b) -> b.compareTo(a));
        //使用foreach进行遍历打印最终的名字
        coll.stream().forEach(System.out::println);
    }

}
