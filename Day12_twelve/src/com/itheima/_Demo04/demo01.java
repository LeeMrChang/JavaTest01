package com.itheima._Demo04;

/**
 * Lambda表达式： name -> new Person(name)
 * 方法引用： Person::new
 */
public class demo01 {

    private static void printName(String name,PersonBuilder builder){

        System.out.println(builder.builderPerson(name).getName());
    }

    public static void main(String[] args) {

        printName("阿斯蒂芬",Person::new);

        printName("子线程",name->new Person(name));

    }
}
