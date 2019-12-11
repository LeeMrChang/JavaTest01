package com.itheima._Demo01;

import java.util.Objects;

/*
toString方法返回该对象的字符串表示，其实该字符串内容就是对象的类型+@+内存地址值。
        由于toString方法返回的结果是内存地址，而在开发中，
        经常需要按照对象的属性得到相应的字符串表现形式，因 此也需要重写它。
*/
public class Person {

    private String name;

    private int age;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
