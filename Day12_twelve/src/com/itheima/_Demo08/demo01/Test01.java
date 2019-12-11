package com.itheima._Demo08.demo01;

public class Test01 {
    public static void main(String[] args) {

        String mgsA = "Hello";
        String mgsB = "Word";
        String mgsC = "Java";

        method(1, new MessageBuider() {
            @Override
            public String BuilderMessage() {
                return mgsA + mgsB + mgsC;
            }
        });
//判断,如果等级等于1的时候,实际的判断操作都在lambda表达式里面
        method(1, () -> mgsA + mgsC + mgsB);

    }

    public static void method(int level, MessageBuider buider) {


        //
        System.out.println(buider.BuilderMessage());


    }


}
