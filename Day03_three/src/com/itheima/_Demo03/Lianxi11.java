package com.itheima._Demo03;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 十一、键盘录入一个字符串，
 *  * 去掉其中重复字符，打印出不同的那些字符，必须保证顺序。
 *  * 例如输入：aaaabbbcccddd，打印结果为：abcd。
 */
public class Lianxi11 {
    public static void main(String[] args) {

        //创建键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符：");
        String zi = sc.next();
        //将字符串转换为字符数组
        char[] chars = zi.toCharArray();

        //创建HashSet集合
        HashSet<Character> set = new HashSet<>();
        //遍历字符数组
        for (int i = 0; i < chars.length; i++) {
            //
            char c = chars[i];
            set.add(c);
        }

        //遍历输出
        for (Character character : set) {
            System.out.print(character+" ");
        }



    }
}
