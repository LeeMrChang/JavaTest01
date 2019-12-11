package com.itheima._Demo01;
/*
(复杂，并不难)定义一个学生类Student，包含三个属性姓名、年龄、性别，
        创建三个学生对象存入ArrayList集合中。
        A：遍历集合遍历输出。
        B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
        */
public class Student {

    //姓名
    private String name;
    //年龄
    private int age;
    //性别
    private String gender;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
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
}
