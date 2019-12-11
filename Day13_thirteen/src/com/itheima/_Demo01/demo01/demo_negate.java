package com.itheima._Demo01.demo01;

import java.util.function.Predicate;

/**默认方法negate
 *它是执行了test方法之后，对结果boolean值进行“!”取反而已
 * 一定要在 test 方法调用之前 调用 negate 方法
 *
 */
public class demo_negate {

    public static void main(String[] args) {
        //条件判断
        method(s -> s.length()<1);
    }

    private static void method(Predicate<String> one){
        //nagete相当于非
        boolean veryLong = one.negate().test("HelloWord!");

        System.out.println("字符串很长吗？"+veryLong);

    }
}
