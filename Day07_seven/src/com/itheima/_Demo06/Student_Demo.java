package com.itheima._Demo06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 对Java基础班学生的考试成绩进行排序
 * 1.	定义一个学生类，有两个属性。姓名，考试成绩
 * 2.	在测试类中定义一个学生数组，存储学生信息。
 * 3.	使用Lambda省略格式写法对学生数组按照考试成绩由高到低进行排序。
 */
public class Student_Demo {

    public static void main(String[] args) {
        //定义一个学生数组
        Student[] stu = {new Student("小林",84),
                new Student("小奇",90),new Student("小陈",82)};
        //创建学生对象

        //对学生数组按照成绩高低的方式进行排序
       /* Arrays.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore()-o1.getScore();
            }
        });*/
        //Lamda
        //Arrays.sort(stu,(o1,o2)->(o2.getScore()-o1.getScore()));

        Arrays.sort(stu,(o1,o2)->{
          return o2.getScore()-o1.getScore();
        });




        //遍历数组
        for (Student ent : stu) {
            System.out.println(ent);
        }

    }
}
