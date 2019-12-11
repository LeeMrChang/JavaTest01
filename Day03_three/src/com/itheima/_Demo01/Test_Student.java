package com.itheima._Demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test_Student {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        //
        list.add(new Student("凯",27));
        list.add(new Student("百里玄策",17));
        list.add(new Student("百里守约",18));



        System.out.println("排序前："+list);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        System.out.println("排序后："+list);

    }
}
