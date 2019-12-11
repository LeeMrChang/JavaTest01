package com.itheima._Demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
分别用Comparable和Comparator两个接口对下列四位同学的成绩做降序排序，
        如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序。
        */
public class ZuoYe_09Sort {


    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("刘三",13,67));
        list.add(new Student("张四",11,88));
        list.add(new Student("王五",14,77));
        list.add(new Student("孙六",12,88));
        //运用Comparator进行排列降序
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o2.getFun()-o1.getFun());//o2是已经存在的，o1是即将要存的
            }
        });

        Collections.sort(list);
        System.out.println(list);


    }


}
