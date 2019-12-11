package com.itheima._Demo10.demo05;

public class BaoZiPu extends Thread {
    //赋予包子资源
    private BaoZi zi;

    public BaoZiPu(BaoZi zi) {
        this.zi = zi;
    }
    //线程操作


    @Override
    public void run() {
        while(true){

            synchronized (zi){
                if(zi.flag){//此时是没有包子状态，吃货进入等待
                    try {
                        zi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //如果跳过上判断，则是有包子壮态
                    System.out.println("吃货正在吃"+zi.pier+zi.xianer+"包子");
                    //吃完包子了，就是没有包子状态
                    zi.flag=false;
                    //唤醒包子铺做包子
                    zi.notify();
                }
            }
        }
    }
}
