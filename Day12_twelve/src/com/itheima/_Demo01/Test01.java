package com.itheima._Demo01;

public class Test01 {
    public static void main(String[] args) {


        method(new Eatable() {
            @Override
            public void eat() {

            }
        });


        method(()->{
            System.out.println("吃饭放");
        });

        //简化
        method(()-> System.out.println("下课了"));
    }
//模拟一个方法，让函数式接口作为方法的参数
    private static void method(Eatable der){
        der.eat();
    }
}
