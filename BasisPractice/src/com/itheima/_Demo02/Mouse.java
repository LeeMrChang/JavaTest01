package com.itheima._Demo02;
//鼠标类，要实现USB接口，并具备点击的方法
public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("鼠标开启，红光闪一闪！！");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭，红光熄灭");
    }
    //鼠标独立的功能方法
    public void click(){
        System.out.println("鼠标点击！！！");
    }
}
