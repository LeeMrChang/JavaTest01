package com.itheima._Demo04;

public class ZuoYe_01 {

    int i = 1;

    public static void main(String[] args) {

        System.out.println("love"+new ZuoYe_01());

        ZuoYe_01 a = new ZuoYe_01();

        a.i++;

        System.out.println("me"+a.i);

    }

    public String toString(){
        System.out.println("I");
        return "java";
    }
}
