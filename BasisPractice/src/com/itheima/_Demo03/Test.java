package com.itheima._Demo03;
/* * 创建TV对象；
         * 创建RemoteControl对象,调用其controlTV的方法；
         * 创建Phone对象,调用其connecting方法和controlTV方法；*/

public class Test {
    public static void main(String[] args) {
            //创建TV对象

        TV tv = new TV("TCL");

        //创建remoteControl对象，调用controlTV的方法
        RemoteControl rol = new RemoteControl();
        rol.controlTV(tv);
        System.out.println("======================================");
        //创建Phone对象
        Phone p = new Phone();
        p.connecting();
        p.controlTV(tv);

    }
}
