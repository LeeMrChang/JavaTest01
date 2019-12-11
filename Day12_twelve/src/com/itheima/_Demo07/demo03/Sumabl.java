package com.itheima._Demo07.demo03;

/**
 * 请定义一个函数式接口 Sumable ，内含抽象 sum 方法，可以将两个int数字相加返回int结果。
 * 使用该接口作为方法 的参数，并进而通过Lambda来使用它。
 */
public interface Sumabl {

    int sum(int a,int b);
}
