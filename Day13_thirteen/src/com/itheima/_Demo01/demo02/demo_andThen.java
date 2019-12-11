package com.itheima._Demo01.demo02;

import java.io.InputStream;
import java.util.function.Function;

/**默认方法andThen
 * Function 接口中有一个默认的 andThen 方法，用来进行组合操作。
 *
 */
public class demo_andThen {
    public static void main(String[] args) {
        //
        method(s -> Integer.parseInt(s),s->s*6789);

       // method(Integer::parseInt,Integer ->Integer*=1 );

    }
    public static void method(Function<String,Integer> one,Function<Integer,Integer> two){

        Integer num = one.andThen(two).apply("1000");

        System.out.println(num);
    }
}
