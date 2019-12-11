package com.itheima._Demo03;
/*
定义手机类Phone,实现RedRay接口，要求：
        1)重写controlTV方法：
        * 方法内输出"手机开启红外功能,控制电视"；
        * 提示用户键盘录入电视节目信息并接受；
        * 调用电视play方法,将节目信息作为参数传入；
*/


import java.util.Scanner;

public class Phone implements RedDay{

    @Override
    public void controlTV(TV tv) {
        System.out.println("手机开启红外线功能，控制电视");
        System.out.println("请输入您想看的电视节目：");
        Scanner sc = new Scanner(System.in);
        tv.play(sc.next());
    }
}
