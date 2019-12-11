package com.itheima._Demo01;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Teacher {

    public static void main(String[] args) {

        ArrayList<Teacher> list = new ArrayList<>();

        list.add(new Teacher("公孙离",16));
        list.add(new Teacher("李元芳",13));
        list.add(new Teacher("虞姬",22));

        System.out.println("排序前"+list);

        Collections.sort(list);
        System.out.println("排序后"+list);
    }
}
