package com.itheima._Demo02;

public class Student {
    //姓名
    private String name;
    //学号
    private int xue;

    public Student() {
    }

    public Student(String name, int xue) {
        this.name = name;
        this.xue = xue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXue() {
        return xue;
    }

    public void setXue(int xue) {
        this.xue = xue;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", xue=" + xue +
                '}';
    }
}
