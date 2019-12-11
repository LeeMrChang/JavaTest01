package com.itheima._Demo07.demo02;

/**
 * 请定义一个函数式接口 Eatable ，内含抽象 eat 方法，没有参数或返回值。
 * 使用该接口作为方法的参数，并进而 通过Lambda来使用它
 */
public class demo {
    public static void main(String[] args) {

        eatale(()-> System.out.println("早读了!~"));
    }
    private static void eatale(Eatable lambda){

        lambda.eat();
        //System.out.println("吃饭了1~");
    }

}
