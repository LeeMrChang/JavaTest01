package com.itheima._Demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test_02Iterator {

    public static void main(String[] args) {
        //
        Collection<Student> coll = new ArrayList<>();
        
        coll.add(new Student("傅红雪",37));
        coll.add(new Student("叶开",36));
        coll.add(new Student("路小佳",33));
        coll.add(new Student("荆无命",49));
        coll.add(new Student("啊飞",47));

        Iterator<Student> it = coll.iterator();
        
        while(it.hasNext()){
            Student stu = it.next();
            System.out.println("姓名是："+stu.getName()+",年龄："+stu.getAge());
        }


    }
}
