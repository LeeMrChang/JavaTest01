package com.itheima._Demo01;

/**
 *
 */
@FunctionalInterface//一旦使用该注解来定义接口，
              // 编译器将会强制检查该接口是否确实有且仅有一个抽象方法，否则将会报错。
public interface MyFunctionalInterface {

    void myMethod();
}
