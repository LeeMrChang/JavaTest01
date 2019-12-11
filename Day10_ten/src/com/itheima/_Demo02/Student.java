package com.itheima._Demo02;

import java.io.Serializable;

/**
 * 描述:定义一个学生类，包含姓名，年龄，性别等成员变量，提供setters和getters方法以及构造方法。
 * 在测试类中创建一个学生对象，给学生对象的三个成员变量赋值。
 * 然后将该对象保存到当前项目根目录下的stu.txt文件中。
 *
 */
public class Student implements Serializable {

    private String name;
    private int age;
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
