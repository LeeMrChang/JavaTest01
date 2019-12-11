package com.itheima._Demo02;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 已知数组存放一批QQ号码，QQ号码最长为11位，
 * 最短为5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
 * 将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，
 * 将list中所有元素分别用迭代器和增强for循环打印出来。
 */
public class ZuoYe_06QQ {



    public static void main(String[] args) {

        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};


        LinkedList<String> list = new LinkedList<>();

        for (int i = 0; i < strs.length; i++) {
            //判断list集合重是否包含这个元素
            if(!list.contains(strs[i])){//如果不存在这个元素
                list.add(strs[i]);//list集合添加这个元素
            }
        }



       /* Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        for (String s : list) {
            System.out.println(s);
        }

    }
}
