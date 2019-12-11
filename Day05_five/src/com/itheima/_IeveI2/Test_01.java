package com.itheima._IeveI2;

/**
 * d)	提供main方法,在main方法中
 * i.	使用满参构造方法创建Person对象,分数传入一个负数,运行程序
 * ii.	由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
 * iii.	使用空参构造创建Person对象
 * iv.	调用setLifeValue(int lifeValue)方法,传入一个正数,运行程序
 * v.	调用setLifeValue(int lifeValue)方法,传入一个负数,运行程序
 * 操作步骤答案
 */
public class Test_01 {

    public static void main(String[] args) {

        Person run = new Person();

        run.setLifeValue(8);

    }
}
