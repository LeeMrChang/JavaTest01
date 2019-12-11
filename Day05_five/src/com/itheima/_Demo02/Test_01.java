package com.itheima._Demo02;

import java.util.Objects;

public class Test_01 {

    public static void main(String[] args) {

        String s = null;

        Objects.requireNonNull(s);

    }

    public static <T> T requireNonNull(T obj) {
        //对参数和null做判断
        if (obj == null) {
            //如果是null，就执行以下代码
            //抛出一个异常对象
            throw new NullPointerException("赋值不能为null");
        }
        return obj;
    }
}
