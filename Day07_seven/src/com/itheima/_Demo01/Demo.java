package com.itheima._Demo01;

public class Demo {

    public static void main(String[] args) {
        //创建资源类对象
        BaoZi zi = new BaoZi();
        //创建两个线程任务对象
        //包子铺
        BaoZiPu put = new BaoZiPu("包子铺",zi);
        //吃货
        ChiHuo chi = new ChiHuo("吃货",zi);
        //调用start（）并开启线程
        put.start();
        chi.start();
    }
}
