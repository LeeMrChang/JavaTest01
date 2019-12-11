package com.itheima._Demo01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 如果一个方法的返回自值类型是一个函数式接口，那么就可以直接返回一个lambda表达式
 * 当方法需要通过一个方法来获取一个Comparator接口类型作为对象排序器时：
 */
public class demo04 {

    private static Comparator<String> newComparator(){


        return (a,b)->(a.length()-b.length());
    }

    public static void main(String[] args) {

        String[] arr = {"String","hello","java","pothey","cph"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,newComparator());
        //Arrays.toString，返回指定数组内容的字符串表示形式
        System.out.println(Arrays.toString(arr));


        Arrays.sort(arr,(String o1,String o2)->{
            return o2.length()-o1.length();
        });

        System.out.println(Arrays.toString(arr));

    }
}
