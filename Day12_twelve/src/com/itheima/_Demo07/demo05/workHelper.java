package com.itheima._Demo07.demo05;

/**假设有一个助理类 Assistant ，其中含有成员方法 dealFile 如下
 * 请自定义一个函数式接口 WorkHelper ，其中的抽象方法 help 的预期行为与 dealFile 方法一致，
 * 并定义一个方法 使用该函数式接口作为参数。
 * 通过方法引用的形式，将助理对象中的 help 方法作为Lambda的实现。
 */
@FunctionalInterface
public interface workHelper {
    void help();

}
