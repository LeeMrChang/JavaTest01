package com.itheima._Demo01;
/*测试类Test
        a)    提供main方法
        b)    在main方法中
        i.    创建Brush类对象b1,价格赋值为5.8,颜色赋值为红色；
        ii.    创建Pencil类对象p1,价格赋值为2.5,颜色赋值为黑色；
        iii.    创建Painter对象,姓名赋值为王流秋；调用两次Painter的draw方法，
        分别传入b1和p1；进行测试；*/

public class Test {
    public static void main(String[] args) {

        //创建Brush对象
        Brush b1 = new Brush();
        b1.setPrice(5.8f);
        b1.setColor("黑色");

        //创建Pencil对象
        Pencil p1 = new Pencil(2.5f,"红色");

        //创建Painter对象 画家类
        Painter pan = new Painter();
        pan.setName("李梁恰");
        pan.draw(b1);
        pan.draw(p1);
    }
}
