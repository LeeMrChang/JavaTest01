package com.itheima._Demo02;

public class KeyBoard implements USB{

    @Override
    public void open() {
        System.out.println("键盘开启，绿光闪一闪！！");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭，绿光熄灭！！");
    }
    //键盘独立功能方法
    public void type(){
        System.out.println("键盘敲打！！！");
    }

}
