package com.itheima._Demo02;

/**
 * 问题：
 * 请使用代码实现
 * 每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
 * 如果老师给学生赋值一个负数,抛出一个自定异常
 */
public class Student {

   private double score;

   private String name;

    public Student() {
    }

    public Student(double score, String name) {
        this.score = score;
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        //this.score = score;
      if(score<0){
        throw new NoScoreException("分数不能为0："+score);
      }
      this.score = score;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
