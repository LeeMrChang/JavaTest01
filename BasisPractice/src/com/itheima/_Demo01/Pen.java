package com.itheima._Demo01;
/*
定义笔类(Pen),实现writeAction接口,重写write()方法，方法内不需要编写内容；
        a)    属性: Price 价格（Float),color颜色(String 类型);
        b)    提供空参,满参构造方法和set/get方法;
*/

public class Pen implements writeAction{
        //属性价格
    private float price;
        //颜色
    private String color;

    @Override
    public void write() {

    }

    public Pen() {
    }

    public Pen(float price, String color) {
        this.price = price;
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
