package com.itheima._Demo02;

public class Student implements Comparable<Student>{
    private String name;

    private int age;

    private double fun;

    public Student() {
    }

    public Student(String name, int age, double fun) {
        this.name = name;
        this.age = age;
        this.fun = fun;
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

    public double getFun() {
        return fun;
    }

    public void setFun(double fun) {
        this.fun = fun;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fun=" + fun +
                '}';
    }


    @Override
    public int compareTo(Student other) {//other是已经存在的，this是即将要存的
        if(other.getFun()==this.getFun()){
            return other.getAge()-this.getAge();
        }
        return (int)(other.getFun()-this.getFun());
    }
}

