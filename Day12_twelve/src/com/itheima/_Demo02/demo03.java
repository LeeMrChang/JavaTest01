package com.itheima._Demo02;

public class demo03 {

    private static void printString(PrintTable table){

        table.print("hello java");
    }

    public static void main(String[] args) {

        //创建对象
        Student stu = new Student();

        printString(stu::StudentCase);
    }

}
