package com.itheima._Demo01;

public class Test_08 {
    public static void main(String[] args) {


        //创建字符缓冲区对象
        StringBuilder buiber = new StringBuilder();
        //append 可以将任何的参数对象添加到此序列化
        StringBuilder buiber2 = buiber.append("hello");

        /*System.out.println(buiber);
        System.out.println(buiber2);
        System.out.println(buiber == buiber2);
*/
        //可以添加任何参数类型
       buiber.append("wrod");
       buiber.append(true);
        buiber.append(100);
       buiber.append("hello").append("word").append(true).append(100);
       System.out.println("buiber=" +buiber);

        /*StringBuilder dui = new StringBuilder();
        System.out.println(dui.append("hello"));*/

    }
}
