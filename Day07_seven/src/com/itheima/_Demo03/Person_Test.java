package com.itheima._Demo03;

import java.util.Arrays;
import java.util.Comparator;

public class Person_Test {

    public static void main(String[] args) {

        Person[] arr = {new Person("费小奇",20),new Person("林小使",22),
        new Person("陈东星",19)};


        //对年龄大小进行排序 升序排列，从小到大
       /*Arrays.sort(arr, new Comparator<Person>() {
           @Override
           public int compare(Person o1, Person o2) {
               return o1.getAge()-o2.getAge();
           }
       });*/
        /**
         * 使用Lambda表达式进行排序写法
         * 一些（参数类型，参数列表）
         * 一个箭头
         * 一些{代码段}
         */
       /*Arrays.sort(arr,(Person o1,Person o2)->{
           return o1.getAge()-o2.getAge();
       });*/
       //胜率写法
       Arrays.sort(arr,((o1, o2) -> o1.getAge()-o2.getAge()));

       //遍历自定义对象数组
        for (Person son : arr) {
            System.out.println(son);

        }
    }
}
