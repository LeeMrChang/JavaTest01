package com.itheima._Demo06.demo11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 3.	在测试类中完成如下要求
 * a)	将五名学生添加到ArrayList集合
 * b)	使用Collections.sort(List<T> list, Comparator<? super T> c)
 * 方法将学生成绩从小到大进行排序（忽略非空判断）
 * i.	使用匿名内部类
 * ii.	使用Lambda表达式
 * iii.	使用方法引用	//tips:借助Comparator接口中静态方法comparingInt()方法
 */
public class Test {
    public static void main(String[] args) {
        //创建list集合容器接收若干同学对象
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("谢霆锋", 85));
        list.add(new Student("章子怡", 63));
        list.add(new Student("刘亦菲", 77));
        list.add(new Student("黄晓明", 33));
        list.add(new Student("岑小村", 92));
        //使用匿名内部类将学生成绩进行排序
       Collections.sort(list, new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o1.getScore()-o2.getScore();
           }
       });

        //使用lambda表达式
        Collections.sort(list,(o1,o2)->{
            return o2.getScore()-o1.getScore();
        });
        Collections.sort(list,(o1,o2)->o2.getScore()-o1.getScore());
        //使用方法引用
        Collections.sort(list,Comparator.comparingInt(Student::getScore));


        for (Student student : list) {
            System.out.println(student);
        }


    }
}
