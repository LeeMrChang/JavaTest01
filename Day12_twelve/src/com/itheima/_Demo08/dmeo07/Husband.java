package com.itheima._Demo08.dmeo07;

/**
 * 丈夫类
 */
public class Husband {

    public void marry(Richable lambda){
        lambda.buy();

    }

    public void behaapy(){
        marry(()-> System.out.println("买套在二环的房子！"));
        //方法引用
       marry(System.out::println);
    }
}
