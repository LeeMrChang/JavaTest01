package com.itheima._Demo02;

import java.util.*;

/**
 * 十一、键盘录入一个字符串，
 * 去掉其中重复字符，打印出不同的那些字符，必须保证顺序。
 * 例如输入：aaaabbbcccddd，打印结果为：abcd。
 */
public class ZuoYe_07ListHashSet {

    public static void main(String[] args) {


       HashSet<Character> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要检验的字符串：");
        String str = sc.nextLine();
        char[] cha = str.toCharArray();

        for (int i = 0; i < cha.length; i++) {
            char c = cha[i];
          set.add(c);

        }

        for (Character chi : set) {
            System.out.print(chi+" ");
        }

    }
}
