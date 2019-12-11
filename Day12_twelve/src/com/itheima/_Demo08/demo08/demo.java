package com.itheima._Demo08.demo08;

public class demo {

    public static void main(String[] args) {
        //通过构造器引用
        method((s)->new Person(s),"星星");

        method(Person::new,"杨sdf");
    }
    public static void method(PersonBuiber per ,String name){
        System.out.println(per.buildPerson(name).getName());
    }
}
