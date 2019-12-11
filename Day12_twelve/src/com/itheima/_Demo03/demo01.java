package com.itheima._Demo03;

public class demo01 {

    private static void print(Jiaoshi str){
        str.lin("好好敲代码！");
    }

    public static void main(String[] args) {
        //创建学生对象,通过学生对象引用成员方法
        Student stu = new Student();

        print(stu::xuexi);

    }
}
