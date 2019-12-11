package com.itheima._Demo03;

import java.util.ArrayList;
import java.util.Iterator;

/*8
复杂，并不难)定义一个学生类Student，包含三个属性姓名、年龄、性别，
创建三个学生对象存入ArrayList集合中。
A：遍历集合遍历输出。
B：求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。

 */
public class Lianxi09 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("小杨",18));
        list.add(new Student("小yu",17));
        list.add(new Student("小狗",19));
        //method2(list);
        method(list);


    }
    public static void method(ArrayList<Student> list ){
        //定义变量存放年龄
        int a = 0;
        //定义变量存放年龄最大的索引值
        int index = 0;
        //遍历集合获取年龄值，与比较
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge()>a){
                //如果年龄大于a,则记录次数
                index=i;
                //把年龄最大的值赋予给a
                a=list.get(i).getAge();
            }
        }
        System.out.println("年龄最大的是："+list.get(index).getAge());
        list.get(index).setName("小猪佩奇");
    }
    /**
     * 遍历
     *
     */
    public static void method2(ArrayList<Student> list){

        for (Student in : list) {
            System.out.println(in);
        }
    }

}
