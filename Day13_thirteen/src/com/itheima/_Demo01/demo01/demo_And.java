package com.itheima._Demo01.demo01;

import java.util.function.Predicate;

/**默认方法 and (default)
 * 既然是条件判断，就会存在与、或、非三种常见的逻辑关系。
 * 其中将两个 Predicate 条件使用“与”逻辑连接起来实 现“并且”的效果时，可以使用default方法 and
 *
 * 如果要判断一个字符串既要包含大写“H”，又要包含大写“W
 */
public class demo_And {
    public static void main(String[] args) {
        //条件里的判断是此字符串里是否包含大写H与大写W
        method(s -> s.contains("H"),s -> s.contains("W"));
    }
    private static void method(Predicate<String> one,Predicate<String> two){
        //and相当于“与"
        boolean isValid = one.and(two).test("HelloWord!");

        System.out.println("H与W是否连接："+isValid);

    }
}
