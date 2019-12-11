package com.itheima._Demo01;
/*
定义画家类（Painter)
        a)    属性: name姓名(String)
        b)    对象方法 : 绘画方法(void draw(Pen p)),首先输出“画家XX正在绘画，”
        然后调用p对象的write方法
        c)    提供空参,满参构造方法;set/get方法
*/

public class Painter {
    //姓名
    private String name;
    //对象方法
    void draw(Pen p){
        System.out.println("画家"+getName()+"正在绘画，");
        p.write();
    }

    public Painter() {
    }

    public Painter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
