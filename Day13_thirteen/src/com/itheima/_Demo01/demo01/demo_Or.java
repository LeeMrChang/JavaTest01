package com.itheima._Demo01.demo01;

import java.util.function.Predicate;

/**默认方法Or
 *与 and 的“与”类似，默认方法 or 实现逻辑关系中的“或
 *如果希望实现逻辑“字符串包含大写H或者包含大写W”，那么代码只需要将“and”修改为“or”名称即可，
 */
public class demo_Or {
    public static void main(String[] args) {
        //判断条件L
        method(s -> s.contains("H"),s -> s.contains("W"));
    }
    private static void method(Predicate<String> one,Predicate<String> two){
        //or相当于“或”
        boolean isValid = one.or(two).test("LelloJava!");

        System.out.println("字符串包含大写H或者包含大写W:"+isValid);
    }
}
