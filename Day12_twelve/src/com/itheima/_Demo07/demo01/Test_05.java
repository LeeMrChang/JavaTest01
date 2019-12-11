package com.itheima._Demo07.demo01;

import java.util.function.Consumer;

/**
 *
 */
public class Test_05 {
    public static void main(String[] args) {

        String[] array = {"朱七七，女","沈浪，男","白飞飞，女"};
      printString(s -> System.out.println("姓名："+s.split("，")[0]),
              s -> System.out.println("。性别："+s.split("，")[1]+"。"),array);


    }

    private static void printString(Consumer<String> one,Consumer<String> two,String[] array){

        for (String info : array) {
            one.andThen(two).accept(info);//姓名，还有性别
        }
    }
}
