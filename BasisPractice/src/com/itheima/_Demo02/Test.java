package com.itheima._Demo02;

public class Test {
    public static void main(String[] args) {

        //创建笔记本实体对象
        Laptop lt = new Laptop();
        //笔记本开启
        lt.run();
        //创建鼠标实体对象
       USB u = new Mouse();
       //使用鼠标
       lt.useUSB(u);
       ((Mouse) u).click();

       //创建键盘实体对象
        USB s = new KeyBoard();
        //使用键盘
        lt.useUSB(s);


        lt.shutDown();

    }
}
