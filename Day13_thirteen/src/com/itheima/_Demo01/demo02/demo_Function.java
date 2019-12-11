package com.itheima._Demo01.demo02;

import java.util.function.Function;

/**Function 接口
 * 接口用来根据一个类型的数据得到另一个类型的数据，前者称为前置条件，
 * 后者称为后置条件。有进有出，所以称为“函数Function”。
 *
 * 抽象方法 apply
 */
public class demo_Function {
    public static void main(String[] args) {
            //
            method(s -> Integer.parseInt(s));
            //引用方法
           method(Integer::parseInt);

    }

    public static void method(Function<String,Integer> function){
        //给入String类型得到Integer类型
        Integer num = function.apply("100");

        System.out.println(num+20);


    }
}
