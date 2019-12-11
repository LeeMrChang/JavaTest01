package com.itheima._Demo10.demo05;

public class demo {
    public static void main(String[] args) {

        //创建线程任务对象，就是包子对象
        BaoZi zi = new BaoZi();

        //创建包子铺线程任务对象
        BaoZiPu pu = new BaoZiPu(zi);
        //创建吃货线程任务对象
        ChiHuo ci = new ChiHuo(zi);

        pu.start();
        ci.start();
    }
}
