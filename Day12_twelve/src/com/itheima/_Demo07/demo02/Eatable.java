package com.itheima._Demo07.demo02;

/**
 * 请定义一个函数式接口 Eatable ，内含抽象 eat 方法，没有参数或返回值。
 * 使用该接口作为方法的参数，并进而 通过Lambda来使用它
 */
@FunctionalInterface
public interface Eatable {

    void eat();
}
