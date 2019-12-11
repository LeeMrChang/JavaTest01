package com.itheima._Demo08;

public class ChiHuo extends Thread {
    //传入包子类参数
    private BaoZi zi;
    public ChiHuo(BaoZi zi) {
        this.zi = zi;
    }

    @Override
    public void run() {
        //无限吃包子
        while(true){
            //创建同步锁、、
            synchronized (zi){
                //判断是否有包子
                if(zi.result=true){//有包子，则包子铺进入等待
                    try {
                        System.out.println("吃货正在吃包子，包子铺请等待");
                        zi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //如跳过上面判断，则是没有包子，假如做一个包子需要2秒
                    try {
                        System.out.println("包子铺正在做包子");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子铺做好包子了，吃货快来吃包子！");
                    //修改此时包子状态
                    zi.result=true;
                    //唤醒吃货
                    zi.notify();


                }

            }

        }

    }
}
