package com.itheima._Demo07;

public class Demo {

    public static void main(String[] args) {
        //创建包子对象
        BaoZi bz = new BaoZi();
        //创建生产者和消费者的两条任务线程对象
        //生产
        Produce p = new Produce(bz);
        //消费
        Consumer c = new Consumer(bz);
        //分别调用
        p.start();
        c.start();

    }
}
