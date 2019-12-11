package com.itheima._Demo01;

public class demo02 {

    private static void log(int level,MessageBuilder msg){

        if(level==1){
            System.out.println(msg.buiderMessage());
        }
    }


    public static void main(String[] args) {

            String msgA = "Hello";
            String msgB = "Word";
            String msgC = "Java";

           log(1,()->{
               System.out.println("兰不大执行！");
               return msgA+msgB+msgC;
           });
    }
}
