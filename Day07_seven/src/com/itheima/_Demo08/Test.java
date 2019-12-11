package com.itheima._Demo08;

public class Test {
    public static void main(String[] args) {

        //创建包子对象
        BaoZi zi = new BaoZi();
        //创建包子铺和吃货的两条任务线程对象
        BaoZiPu p = new BaoZiPu(zi);
        //吃货
        ChiHuo c = new ChiHuo(zi);

        p.start();
        c.start();




    }
}
